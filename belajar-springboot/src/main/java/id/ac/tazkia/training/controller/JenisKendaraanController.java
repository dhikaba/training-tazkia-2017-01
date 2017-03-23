package id.ac.tazkia.training.controller;

import id.ac.tazkia.training.dao.JenisKendaraanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JenisKendaraanController {

    @Autowired
    private JenisKendaraanDao jkDao;

    @RequestMapping("/jeniskendaraan/list")
    public ModelMap daftarKendaraan(){
        return new ModelMap("daftarJenisKendaraan", jkDao.findAll());
    }
}
