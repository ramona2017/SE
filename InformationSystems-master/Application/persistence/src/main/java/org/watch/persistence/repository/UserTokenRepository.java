package org.watch.persistence.repository;

import org.watch.persistence.model.UserTokenModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTokenRepository extends CrudRepository<UserTokenModel, Integer>{

	UserTokenModel findByToken(String token);

}