package manage.dao;


import java.util.List;

import manage.entity.Resource;

public interface ResourceDAO {
    public long createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(long id);
    public List<Resource> getAllResources();
    public Resource getResource(long id);   
    public List<Resource> getAllResources(String resourceName);
}