package org.watch.controller;

import org.watch.authentication.AuthenticationService;
import org.watch.controller.response.SignupResponse;
import org.watch.persistence.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/signup")
public class SignUpController {

	@Autowired
	private AuthenticationService authenticationService;

	@PostMapping
	public SignupResponse processNewUserFrom(@RequestBody UserModel newUser) {
		authenticationService.createUser(newUser);
		SignupResponse response = new SignupResponse();
		response.setMessage("Thank you for registering. Please confirm your email within 1 day. You may proceed to login");
		response.setStatus(200);
		return response;
	}
	
	@GetMapping
	public String processTest() {
		return "test";
	}
}