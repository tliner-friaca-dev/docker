package br.com.projeto.dockerApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.dockerApp.model.Documento;
import br.com.projeto.dockerApp.repository.AppRepository;

@Service
public class AppService {
    
    @Autowired
    private AppRepository appRepository;

    public List<Documento> obterTodos(){
        return appRepository.findAll();
    }
}
