package org.watch.service;

import org.watch.persistence.model.UserModel;

public interface UserService {

	public void createUser(UserModel user, String token);

	public boolean verify(String userToken);

	public long getUserId();

	public UserModel findById(long id);

	public String getUsername();


}