package com.dmcelligott.rules.engine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class AppMain {
	public static void main(String[] args) {
		
		RulesEngine rulesEngine = new RulesEngine();
		
		try {
			ScriptEngineManager factory = new ScriptEngineManager();
			ScriptEngine engine = factory.getEngineByName("nashorn");
			
			engine.eval("function hi(){\nvar a = 'PROSPER'.toLowerCase(); \nmiddle(); \nprint('Live long and' + a)}\n function middle(){\n var b = 1; for(var i=0, max = 5; i<max;i++){\nb++;\n}\n print('b is '+b);}hi();");
		} catch (ScriptException ex) {
			// ...+
		}
	}
}
