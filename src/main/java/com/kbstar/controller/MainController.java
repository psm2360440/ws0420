package com.kbstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(){
        return "index";
    }

    @RequestMapping("/charts")
    public String charts(Model model){
        model.addAttribute("contents", "charts");
        return "index";
    }

    @RequestMapping("/tables")
    public String tables(Model model){
        model.addAttribute("contents", "tables");
        return "index";
    }

    @RequestMapping("/buttons")
    public String buttons(Model model){
        model.addAttribute("contents", "buttons");
        return "index";
    }

    @RequestMapping("/cards")
    public String cards(Model model){
        model.addAttribute("contents", "cards");
        return "index";
    }

    @RequestMapping("/blank")
    public String blank(Model model){
        model.addAttribute("contents", "blank");
        return "index";
    }

    @RequestMapping("/s404")
    public String s404(Model model){
        model.addAttribute("contents", "s404");
        return "index";
    }


}
