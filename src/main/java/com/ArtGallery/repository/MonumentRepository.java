package com.ArtGallery.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ArtGallery.model.Monument;
import com.ArtGallery.model.User;

	@Repository
	public interface MonumentRepository extends JpaRepository<Monument, Long> {
	}



