package org.watch.persistence.repository;

import java.util.List;

import org.watch.persistence.model.ResourceModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends CrudRepository<ResourceModel, Integer>{

	ResourceModel findById(int id);
	
	List<ResourceModel> findAll();

}
