package com.mvcproject.stickynotes.controller;


import com.mvcproject.stickynotes.model.dto.addstickynotedto;
import com.mvcproject.stickynotes.model.dto.notedto;
import com.mvcproject.stickynotes.model.dto.stickynotedto;
import com.mvcproject.stickynotes.model.dto.updatestickynotedto;
import com.mvcproject.stickynotes.service.noteservice;
import com.mvcproject.stickynotes.service.stickynoteservice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class stickynotecontroller {



    //@Autowired
    private final stickynoteservice stickynoteservice;
    private final noteservice noteservice;

    @GetMapping("/")
    public String home   (Model model ){
        List<addstickynotedto> stickynotedtos = this.stickynoteservice.allstickynotes();
        model.addAttribute("stickynotes" , stickynotedtos);
        return"home";
    }



    @GetMapping("stickynote/{id}")
    public String stickynote   (@PathVariable(name = "id" ) Long id , Model model){
          stickynotedto stickynote =this.stickynoteservice.findbyid(id);
         List<notedto> notes =  this.noteservice.getallnotes(id);
        model.addAttribute("stickynote", stickynote) ;
        model.addAttribute("notes", notes) ;
        return"stickynote";
    }


    @GetMapping("stickynote/{id}/edit")
    public String edit  (@PathVariable(name = "id") Long id , Model model){
        stickynotedto stickynote =this.stickynoteservice.findbyid(id);
        model.addAttribute("stickynote", stickynote) ;
        return"edit";
    }


    @PostMapping(path = "/save")
    public String adenewstickynote (@ModelAttribute addstickynotedto dto){
          this.stickynoteservice.addstickynote(dto);
          return "redirect:/";
    }


    @PostMapping(path = "/update/{id}")
    public String updatestickynote (@ModelAttribute updatestickynotedto dto , @PathVariable("id") Long id){
        this.stickynoteservice.update(dto ,id );
        return "redirect:/stickynote/" + id;
    }









}
