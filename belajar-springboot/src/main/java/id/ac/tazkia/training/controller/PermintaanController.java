package id.ac.tazkia.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PermintaanController {
    @RequestMapping("/permintaan/list")
    public ModelMap daftarPermintaan(){
        return new ModelMap();
    }

    @RequestMapping("/permintaan/form")
    public ModelMap tampilkanForm(){
        return new ModelMap();
    }
}
