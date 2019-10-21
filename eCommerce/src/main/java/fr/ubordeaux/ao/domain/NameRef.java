package fr.ubordeaux.ao.domain;


public class NameRef{

	private String stringName;


	public NameRef(String s) throws NameRefException{;
		if((s.length() > 20)){
			throw new NameRefException();
		}
		stringName = s; 
	}

	public String getNameString(){
		return stringName;
	}





}
