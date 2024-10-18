package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, String> {
}