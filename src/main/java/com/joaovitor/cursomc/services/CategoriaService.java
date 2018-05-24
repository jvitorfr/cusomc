package com.joaovitor.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaovitor.cursomc.domain.Categoria;
import com.joaovitor.cursomc.repositories.CategoriaRepository;
import com.joaovitor.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(()  -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+id+", tipo: "+Categoria.class.getName()));


	}
	
	
}
