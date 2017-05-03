package manage.resources;


import manage.dao.ResourceDAO;
import mange.entity.Resource;
import manage.resources.ResourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResourceServiceImpl  implements ResourceService {
    
	public  ResourceServiceImpl () {
        System.out.println("ResourceServiceImpl()");
    }
    
    @Autowired
    private ResourceDAO resourceDAO;

    @Override
    public long createResource(Resource resource) {
        return resourceDAO.createResource(resource);
    }
    @Override
    public Resource updateResource(Resource resource) {
        return resourceDAO.updateResource(resource);
    }
    @Override
    public void deleteResource(long id) {
    	resourceDAO.deleteResource(id);
    }
    @Override
    public List<Resource> getAllResources() {
        return resourceDAO.getAllResources();
    }
    @Override
    public Resource getResource(long id) {
        return resourceDAO.getResource(id);
    }    
    @Override
    public List<Resource> getAllResources(String resourceName) {
        return resourceDAO.getAllResources(resourceName);
    }
}