package br.com.projeto.dockerApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.dockerApp.model.Documento;

public interface AppRepository extends JpaRepository<Documento, Integer> {
    
}
