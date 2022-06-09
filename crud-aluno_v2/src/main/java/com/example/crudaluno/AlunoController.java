package com.example.crudaluno;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {
	@Autowired
	private AlunoService service;
	
	@PostMapping("/addAluno")
	public Aluno addAluno(@RequestBody Aluno a) {
		return service.createAluno(a);
	}
	
	@GetMapping("/aluno/{id}")
	public Aluno searchAlunoById(@PathVariable int id){
		return service.getAlunoById(id);
	}
		
	@GetMapping("/alunos")
	public List<Aluno> lstAlunos(){
		return service.listAlunos();
	}
	
	@PutMapping("/updateAluno")
	public Aluno updtAluno(@RequestBody Aluno a) {
		return service.updateAluno(a);
	}
	
	@DeleteMapping("/aluno/{id}")
	public String delAluno(@PathVariable int id) {
		return service.deleteAluno(id);
	}
}
