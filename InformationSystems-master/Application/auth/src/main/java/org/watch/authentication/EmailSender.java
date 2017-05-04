package org.watch.authentication;
public interface EmailSender {

	void sendMail(String to, String token);
	
}