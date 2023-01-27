package br.com.projeto.dockerApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ModeloApplicationTests {

	@Autowired
	private AppService appService;


	@Test
	void contextLoads() {

		
		List<Produto> produtos = appService.obterTodos();

		System.out.println(produtos.size());

		assertEquals("2", "2");
	}

}
