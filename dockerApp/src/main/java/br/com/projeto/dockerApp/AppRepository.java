package br.com.projeto.dockerApp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<Produto, Integer> {
    
}
