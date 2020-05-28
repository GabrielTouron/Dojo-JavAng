package com.example.demo.dojoController;

import java.util.List;

import com.example.demo.dojoEntity.Dojo;
import com.example.demo.dojoRepository.DojoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class dojoController {


    
    @GetMapping("/dojo")
    public List<Dojo> getAll() {
        DojoRepository repo = new DojoRepository();

        return repo.findAll();
    }


}