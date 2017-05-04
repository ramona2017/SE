package org.watch.service;

import java.util.List;

import org.watch.persistence.model.ResourceModel;
import org.watch.persistence.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService{

	@Autowired
	private ResourceRepository resourceRepository;

	@Override
	public void createResource(ResourceModel resource) {
		resourceRepository.save(resource);
	}

	@Override
	public void deleteResource(int id) {
		resourceRepository.delete(id);
	}

	@Override
	public List<ResourceModel> getAllResources() {
		return resourceRepository.findAll();
	}

	@Override
	public ResourceModel getResource(int id) {
		return resourceRepository.findById(id);
	}
	
}
