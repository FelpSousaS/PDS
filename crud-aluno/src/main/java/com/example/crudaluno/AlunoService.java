package com.example.crudaluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository repo;
	
	
	public Aluno createAluno(Aluno a) {
		return repo.save(a);
	}
	
	public Aluno getAlunoById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Aluno> listAlunos(){
		return repo.findAll();
	}
	
	public Aluno updateAluno(Aluno a) {
		java.util.Optional<Aluno> op = repo.findById(a.getId());
		Aluno old = null;
		if(op.isPresent()) {
			Aluno a1 = op.get();
			a1.setMatricula(a.getMatricula());
			a1.setNome(a.getNome());
			a1.setCurso(a.getCurso());
			a1.setIra(a.getIra());
			
			repo.save(a1);
		}else {
			return new Aluno();
		}
		return old;
	}
	
	public String deleteAluno(int id) {
		repo.deleteById(id);
		return "Aluno deletado com sucesso!";
	}
	
}
