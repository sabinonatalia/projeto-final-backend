package com.mjv.projetofinal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjv.projetofinal.model.Profissional;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {

	public List <Profissional> findAllByAreaContainingIgnoreCase(String area);
}
