package fr.ubordeaux.ao.domain;

import java.util.regex.*;

public class Name{

	private String name;

	public Name(String s) throws NameException{
		if(s.length() > 20 || !Pattern.matches(".*[a-zA-Z0-9]+.*",s)){
			throw new NameException();
		}
		
		this.name = s;
	}

	

}
