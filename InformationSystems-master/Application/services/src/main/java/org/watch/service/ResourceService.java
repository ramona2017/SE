package org.watch.service;

import java.util.List;

import org.watch.persistence.model.ResourceModel;

public interface ResourceService {
	
	public void createResource(ResourceModel resource);

	public void deleteResource(int id);

	public List<ResourceModel> getAllResources();

	public ResourceModel getResource(int id);
}