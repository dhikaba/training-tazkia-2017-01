package id.ac.tazkia.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KendaraanController {

    @RequestMapping("/kendaraan/list")
    public ModelMap daftarKendaraan(){
        return new ModelMap();
    }
}
