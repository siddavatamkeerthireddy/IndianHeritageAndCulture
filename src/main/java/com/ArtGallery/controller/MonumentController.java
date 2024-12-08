package com.ArtGallery.controller;

import java.util.List; // Correct import for List
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ArtGallery.model.Monument;
import com.ArtGallery.service.MonumentService;

@RestController
@RequestMapping("/api/monuments")
public class MonumentController {

    @Autowired
    private MonumentService monumentService;

    @PostMapping
    public Monument addMonument(@RequestBody Monument monument) {
        return monumentService.saveMonument(monument);
    }

    @GetMapping
    public List<Monument> getAllMonuments() { // Specify the generic type for List
        return monumentService.getAllMonuments();
    }
}
