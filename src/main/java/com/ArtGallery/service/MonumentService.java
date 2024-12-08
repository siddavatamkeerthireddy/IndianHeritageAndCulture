package com.ArtGallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ArtGallery.model.Monument;
import com.ArtGallery.repository.MonumentRepository;

@Service
	public class MonumentService {

	    @Autowired
	    private MonumentRepository monumentRepository;

	    public Monument saveMonument(Monument monument) {
	        return monumentRepository.save(monument);
	    }

	    public List<Monument> getAllMonuments() {
	        return monumentRepository.findAll();
	    }
	}

