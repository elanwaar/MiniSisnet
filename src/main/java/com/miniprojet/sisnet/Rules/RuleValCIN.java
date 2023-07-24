package com.miniprojet.sisnet.Rules;

public class RuleValCIN {
	
	
	
	public boolean validate(String CIN) {
		
		//length must be between 5 and 7
		if(CIN.length() > 7 || CIN.length() <5)
			return false;
		
		//first character must be a letter
		if(!Character.isLetter(CIN.charAt(0)))
			return false;
		
		//except for the first two characters, all must be numbers
		String subString = CIN.substring(2);
		for(int i=0; i<subString.length(); i++) {
			if(Character.isDigit(subString.charAt(i))) {
				return false;
			}
		}
		
		
		return true;
	}

}
