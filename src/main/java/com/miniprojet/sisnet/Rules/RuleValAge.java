package com.miniprojet.sisnet.Rules;

import java.sql.Timestamp;

public class RuleValAge {

	
	public boolean validate(int age) {
		
		if(age>65)
			return false;
		
		return true;
	}
}
