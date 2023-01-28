package br.com.projeto.dockerApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.dockerApp.model.Documento;
import br.com.projeto.dockerApp.service.AppService;

@RestController
@RequestMapping("/app")
public class AppController {
    
	@Autowired
	private AppService appService;
    
    @GetMapping
    public void ping() {

        System.out.println("Funcionou");

    }

    @GetMapping("/obterTodos")
    public List<Documento> obterTodos() {

        System.out.println("obterTodos");
		return this.appService.obterTodos();

    }
}
