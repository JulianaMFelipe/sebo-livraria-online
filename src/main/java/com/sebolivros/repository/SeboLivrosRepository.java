package com.sebolivros.repository;

import com.sebolivros.domain.LivroDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeboLivrosRepository extends JpaRepository<LivroDomain, Integer> {
}
