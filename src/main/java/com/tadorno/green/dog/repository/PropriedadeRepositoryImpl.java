package com.tadorno.green.dog.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tadorno.green.dog.dto.PropriedadeDTO;

@Repository
public class PropriedadeRepositoryImpl {
	
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<PropriedadeDTO> selectAll(){
		Query query =  em.createQuery("SELECT p.descricao, p.nome, c.descricao FROM Propriedade p INNER JOIN p.categoria c");
        
        return fillPropriedade(query.getResultList());
	} 
	
	private List<PropriedadeDTO> fillPropriedade(List<Object[]> resultSet){
		List<PropriedadeDTO> list = new ArrayList<>();
		for(Object[] row : resultSet){
			PropriedadeDTO dto = new PropriedadeDTO();
			dto.setDescricao((String) row[0]);
			dto.setNome((String) row[1]);
			dto.setCategoria((String) row[2]);
			
			list.add(dto);
		}
		return list;
	}
}
