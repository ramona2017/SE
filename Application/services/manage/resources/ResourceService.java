package manage.resources;

import manage.entity.Resource;

import java.util.List;


public interface ResourceService {
    public long createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(long id);
    public List<Resource> getAllResources();
    public Resource getResource(long id);   
    public List<Resource> getAllResources(String resourceName);
}