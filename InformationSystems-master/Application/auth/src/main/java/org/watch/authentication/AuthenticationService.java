package org.watch.authentication;

import org.watch.persistence.model.UserModel;

public interface AuthenticationService {
	
	void createUser(UserModel user);

	String validate(String userToken);
}