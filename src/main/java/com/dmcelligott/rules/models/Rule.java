package com.dmcelligott.rules.models;

public interface Rule {
	
	
	public void handle(MailThread mailThread);

	boolean isMatch(MailThread mailThread);

}
