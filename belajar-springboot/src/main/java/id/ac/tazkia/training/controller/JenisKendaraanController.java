package id.ac.tazkia.training.controller;

import id.ac.tazkia.training.dao.JenisKendaraanDao;
import id.ac.tazkia.training.entity.JenisKendaraan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JenisKendaraanController {

    @Autowired
    private JenisKendaraanDao jkDao;

    @RequestMapping("/jeniskendaraan/list")
    public ModelMap daftarKendaraan(){
        return new ModelMap("daftarJenisKendaraan", jkDao.findAll());
    }

    @RequestMapping(value = "/jeniskendaraan/form", method = RequestMethod.GET)
    public ModelMap tampilkanForm(@RequestParam(value = "id", required = false) JenisKendaraan jk){
        if(jk == null){
            jk = new JenisKendaraan();
        }

        return new ModelMap("jenisKendaraan", jk);
    }
}
