package br.com.projeto.dockerApp;

import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
    
    @GetMapping
    public void ping() {

        System.out.println("Funcionou");

    }

}
