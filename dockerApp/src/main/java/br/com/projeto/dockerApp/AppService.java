package br.com.projeto.dockerApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    
    @Autowired
    private AppRepository appRepository;

    public List<Produto> obterTodos(){
        return appRepository.findAll();
    }
}
