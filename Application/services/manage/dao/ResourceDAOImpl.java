
package manage.dao.impl;

import manage.dao.ResourceDAO;
import manage.entity.Resource;
import manage.util.HibernateUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


@Repository
public class ResourceDAOImpl implements ResourceDAO {
    
    public ResourceEmployeeDAOImpl() {
        System.out.println("ResourceDAOImpl");
    }
    
    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public long createResource(Resource resource) {        
        return (Long) hibernateUtil.create(resource);
    }
    
    @Override
    public Resource updateResource(Resource resource) {        
        return hibernateUtil.update(resource);
    }
    
    @Override
    public void deleteResource(long id) {
    	Resource resource = new Resource();
    	resource.setId(id);
        hibernateUtil.delete(resource);
    }
    
    @Override
    public List<Resource> getAllResources() {        
        return hibernateUtil.fetchAll(Resource.class);
    }
    
    @Override
    public Resource getResource(long id) {
        return hibernateUtil.fetchById(id, Resource.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Resource> getAllResources(String resourceName) { 
        String query = "SELECT e.* FROM Resources e WHERE e.name like '%"+ resourceName +"%'";
        List<Object[]> resourceObjects = hibernateUtil.fetchAll(query);
        List<Resource> resources = new ArrayList<Resource>();
        for(Object[] resourceObject: resourceObjects) {
        	Resource resource = new Resource();
            long id = ((BigInteger) resourceObject[0]).longValue();         
            int timeAllocation = (int) resourceObject[1];
            String name = (String) resourceObject[2];
            int roomMember = (int) resourceObject[3];
            int capacity= (int) resourceObject[3];
            resource.setId(id);
            resource.setName(name);
            resource.setTimeAllocation(timeAllocationage);
            resource.setRoomMember(roomMember);
            resource.setCapacity(capacity);
            resource.setAvailability(availability);
            resource.add(resource);
        }
        System.out.println(resources);
        return resources;
    }
}

