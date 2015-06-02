package com.dmcelligott.rules.engine;

import java.util.List;

import com.dmcelligott.rules.models.Rule;

public class RulesEngine {
	
	List<Rule> rules;
	
	public void registerRule(Rule rule) {
		rules.add(rule);
	}
	
	

}
