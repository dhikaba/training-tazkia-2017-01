package id.ac.tazkia.training.controller;

import id.ac.tazkia.training.dao.JenisKendaraanDao;
import id.ac.tazkia.training.entity.JenisKendaraan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

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

    @RequestMapping(value = "/jeniskendaraan/form", method = RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid JenisKendaraan jk, BindingResult err, SessionStatus status){
        if(err.hasErrors()){
            return "/jeniskendaraan/form";
        }
        jkDao.save(jk);
        status.setComplete();
        return "redirect:/jeniskendaraan/list";
    }
}
