package com.insea;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.insea.dao.ContactRepository;
import com.insea.entities.Contact;

@SpringBootApplication
public class Main implements CommandLineRunner {
	@Autowired
   private ContactRepository contactrepository ;
   
	public static void main(String[] args) {
		
		SpringApplication.run(Main.class, args);
	}

	public void run(String... arg0) throws Exception {
		 // DateFormat df =new SimpleDateFormat("dd/mm/yyyy");
		//contactrepository.save(new Contact("Hajoui", "Meryem", df.parse("01/02/1975"), "badrvkacimi@gmail.com", 8888, "badr.jpg"));
		//contactrepository.save(new Contact("Saidi", "Soraya", df.parse("01/02/1996"), "faissalvkacimi@gmail.com", 8888, "badr.jpg"));
	  //contactrepository.save(new Contact("KACIMI", "Mohamed", df.parse("01/04/1962"), "ilhamvrachidi@gmail.com", 8888, "badr.jpg"));
	  //contactrepository.save(new Contact("Sami", "Othmane", df.parse("01/04/2001"), "ilhamvrachidi@gmail.com", 8888, "badr.jpg"));
	  //contactrepository.save(new Contact("Morsli", "Ayamane", df.parse("27/04/1996"), "badrvkacimi@gmail.com", 8888, "badr.jpg"));
		//contactrepository.save(new Contact("Ouaacha", "Rania", df.parse("01/02/1996"), "faissalvkacimi@gmail.com", 8888, "badr.jpg"));
	  //contactrepository.save(new Contact("Amaraoui", "Asmae", df.parse("01/04/1996"), "ilhamvrachidi@gmail.com", 8888, "badr.jpg"));
	  //contactrepository.save(new Contact("Salhi", "Wiam", df.parse("01/04/1995"), "ilhamvrachidi@gmail.com", 8888, "badr.jpg"));
		
		//contactrepository.findAll().forEach(c->{
		//.out.println(c.getNom());       });


	}
}
