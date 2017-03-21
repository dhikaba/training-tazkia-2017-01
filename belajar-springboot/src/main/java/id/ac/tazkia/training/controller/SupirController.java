package id.ac.tazkia.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class SupirController {

    @RequestMapping("/supir/list")
    public ModelMap daftarSupir(){
        ModelMap mm = new ModelMap();

        mm.addAttribute("sekarang", new Date());

        return mm;
    }
}
