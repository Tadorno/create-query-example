package com.tadorno.green.dog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tadorno.green.dog.dto.PropriedadeDTO;
import com.tadorno.green.dog.model.Propriedade;
import com.tadorno.green.dog.repository.PropriedadeRepository;
import com.tadorno.green.dog.repository.PropriedadeRepositoryImpl;

@Service
public class PropriedadeService {
	
	@Autowired
	private PropriedadeRepository propriedadeRepository;
	
	@Autowired
	private PropriedadeRepositoryImpl impl;
	
	public List<Propriedade> findByFiltro(String filtro){
		return propriedadeRepository.findByFiltro(filtro);
	}
	
	public List<PropriedadeDTO> selectAll(){
		return impl.selectAll();
	}
}
