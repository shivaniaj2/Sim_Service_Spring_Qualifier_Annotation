package com.jbk;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim {

	@Override
	public String calling() {
		// TODO Auto-generated method stub
		return ("YOU ARE CALLING FROM AIRTEL");
	}

}
