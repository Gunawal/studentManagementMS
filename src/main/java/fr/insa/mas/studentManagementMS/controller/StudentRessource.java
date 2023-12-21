package fr.insa.mas.studentManagementMS.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.studentManagementMS.Model.Student;

@RestController
public class StudentRessource {
	
	@GetMapping("/students")
	public int studentNumer() {
		return 200;
	}
	
	@GetMapping("/status")
	public String deployement() {
		return "Re-Deployement of the MS succeeds!";
	}
	
	@GetMapping(value="/students/{id}")
	public Student infoStudent(@PathVariable int id) {
		Student student=new Student(id, "Rosa","Parks");
		return student;
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_XML_VALUE)
	public Student xmlInfoStudent(@PathVariable int id) {
		Student student=new Student(id, "Rosa","Parks");
		return student;
	}
	
	@PostMapping(value="/{id}")
	public void ajoutStudent(@PathVariable int id, @PathVariable String nom, @PathVariable String prenom) {
		Student s = new Student(id,nom,prenom);
		System.out.println("Ajout!");
		
	}

}
