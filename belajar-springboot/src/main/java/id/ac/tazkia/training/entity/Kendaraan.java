package id.ac.tazkia.training.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Kendaraan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne @NotNull
    @JoinColumn(name = "id_jenis_kendaraan")
    private JenisKendaraan jenisKendaraan;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 20)
    @Column(name = "nopol")
    private String nomorPolisi;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 50)
    private String merek;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 100)
    private String tipe;

    @NotNull @Min(1)
    private Integer kapasitasPenumpang;

    @NotNull @Min(100)
    private Integer kapasitasMesin;

    @ManyToOne @JoinColumn(name = "id_supir_utama")
    private Supir supirUtama;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public JenisKendaraan getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(JenisKendaraan jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public void setNomorPolisi(String nomorPolisi) {
        this.nomorPolisi = nomorPolisi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Integer getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(Integer kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public Integer getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(Integer kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public Supir getSupirUtama() {
        return supirUtama;
    }

    public void setSupirUtama(Supir supirUtama) {
        this.supirUtama = supirUtama;
    }
}
