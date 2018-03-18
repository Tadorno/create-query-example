package com.tadorno.green.dog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.tadorno.green.dog.model.Propriedade;

public interface PropriedadeRepository extends PagingAndSortingRepository<Propriedade, String>{
	@Query("Select p from Propriedade p where p.nome like %:filtro% order by categoria,subcategoria,nome")	
	public List<Propriedade> findByFiltro(@Param("filtro") String filtro);	
}
