package com.jbk;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim {

	@Override
	public String calling() {
		// TODO Auto-generated method stub
		return ("YOU ARE CALLING FROM JIO");
	}

}
