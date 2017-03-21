package id.ac.tazkia.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class SupirController {

    @RequestMapping("/supir/list")
    public ModelMap daftarSupir(@RequestParam(required = false) String nama){

        ModelMap mm = new ModelMap();
        mm.addAttribute("sekarang", new Date());
        mm.addAttribute("cari", nama);
        return mm;

    }

    @RequestMapping(value = "/supir/form", method = RequestMethod.GET)
    public void tampilkanForm(){

    }


    @RequestMapping(value = "/supir/form", method = RequestMethod.POST)
    public String prosesForm(){
        return "redirect:/supir/list";
    }
}
