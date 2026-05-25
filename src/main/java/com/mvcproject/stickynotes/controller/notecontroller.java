package com.mvcproject.stickynotes.controller;



import com.mvcproject.stickynotes.model.dto.addnotedto;
import com.mvcproject.stickynotes.model.dto.notedto;
import com.mvcproject.stickynotes.service.noteservice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/note")
@RequiredArgsConstructor
public class notecontroller {

    private final  noteservice noteservice;

    @PostMapping(path = "/add/{stickynoteid}")
    public String addnote(@ModelAttribute("dto") addnotedto dto , @PathVariable("stickynoteid") Long stickynoteid){
          this.noteservice.add(dto , stickynoteid);
          return "redirect:/stickynote/" + stickynoteid;

    }


    @PostMapping("/delete/{id}")
    public String deletenote(@PathVariable Long id, @RequestParam(required = false) Long stickynoteid) {
        noteservice.deleteNote(id);
        if (stickynoteid == null) {
            return "redirect:/note";
        }
        return "redirect:/stickynote/" + stickynoteid;
    }



    @GetMapping("")
    public String mynotes   (Model model){

        List<notedto> notes = this.noteservice.getallnotes();
        model.addAttribute("notes", notes);
        return"my-notes";
    }






}
