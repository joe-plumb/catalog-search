package com.emart.catalogsearch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.repository.query.Param;

public interface ItemRepository extends CrudRepository<Item, Long> {
	
	@RestResource(path="find")
	Iterable<Item> findByCategoryfull(@Param("categoryfull") String categoryfull);
	
}