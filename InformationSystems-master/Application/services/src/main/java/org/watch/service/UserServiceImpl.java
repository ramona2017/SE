package org.watch.service;


import java.util.Date;

import org.watch.persistence.model.RoleModel;
import org.watch.persistence.model.UserModel;
import org.watch.persistence.model.UserTokenModel;
import org.watch.persistence.repository.RoleRepository;
import org.watch.persistence.repository.UserRepository;
import org.watch.persistence.repository.UserTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository userRoleRepository;

	@Autowired
	private UserTokenRepository userTokenRepository;

	public void createUser(UserModel user, String token) {
		RoleModel role = userRoleRepository.findByRole("ROLE_USER");
		user.setRole(role);

		UserTokenModel userToken = new UserTokenModel();
		userToken.setToken(token);
		userToken.setDate(new Date());
		userTokenRepository.save(userToken);

		userToken = userTokenRepository.findByToken(token);
		user.setUserToken(userToken);
		userRepository.save(user);

	}

	@Override
	public boolean verify(String userToken) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getUserId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserModel findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
}