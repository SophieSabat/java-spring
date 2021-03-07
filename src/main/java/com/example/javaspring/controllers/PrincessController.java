package com.example.javaspring.controllers;


import com.example.javaspring.dao.PrincessDAO;
import com.example.javaspring.models.Princess;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PrincessController {

    private PrincessDAO princessDAO;

    @GetMapping("/savePrincess")
    public void savePrincess(@RequestParam String name) {
        Princess princess = new Princess(name);
        princessDAO.save(princess);
    }

    @GetMapping("/getPrincess")
    public List<Princess> getPrincess() {
        return princessDAO.findAll();
    }
}
