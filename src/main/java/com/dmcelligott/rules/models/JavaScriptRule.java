package com.dmcelligott.rules.models;

public class JavaScriptRule implements Rule {
	
	String javaScriptRule;
	
	public JavaScriptRule(String javaScriptRule) {
		this.javaScriptRule = javaScriptRule;
	}

	public boolean isMatch(MailThread mailThread) {
		// TODO Auto-generated method stub
		return false;
	}

	public void handle(MailThread mailThread) {
		// TODO Auto-generated method stub
		
	}

}
