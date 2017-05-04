package org.watch.authentication;
import java.util.UUID;

public class UserTokenGenerator implements TokenGenerator {

	public String generateToken() {
		String token;

		UUID uuid = UUID.randomUUID();//UUID is a 128-bit number used to identify information in computer systems
		token = uuid.toString();
		return token;
	}

}