package com.openjournal.backrevista;

import com.openjournal.backrevista.repository.EditoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackRevistaApplication implements CommandLineRunner {

	@Autowired
	private EditoresRepository editoresRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackRevistaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		Editores editores = new Editores();


		Articulos articulos =new Articulos();
		articulos.setEditores(editores);
		articulos.setPalabrasClaves(new String[]{"hola", "mundo"});
		articulos.setUrl("url de prueba");

		editores.setEmail("user@mail.com");
		editores.setArticulos(Arrays.asList(articulos));
		editores.setRoles(ROLES.ADMIN);

		editoresRepository.save(editores);
		*/

		//editoresRepository.deleteById(1L);

	}

}
