package com.tadorno.green.dog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tadorno.green.dog.dto.PropriedadeDTO;
import com.tadorno.green.dog.model.Propriedade;
import com.tadorno.green.dog.service.PropriedadeService;

@RestController
public class PropriedadeController {

	@Autowired
	private PropriedadeService propriedadeService;
	
	@GetMapping("/find/{filtro}")
	public List<Propriedade> findByFiltro(@PathVariable("filtro") String filtro){
		
		return propriedadeService.findByFiltro(filtro);
	}
	
	@GetMapping("/findAll")
	public List<PropriedadeDTO> findAll(){
		
		return propriedadeService.selectAll();
	}
}
