package com.m4u.curso.repository;
import com.m4u.curso.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {
}
