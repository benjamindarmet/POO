package fr.ubordeaux.ao.domain;

import java.io.IOException;

public class NameRefException extends Exception{

	public NameRefException(){
		super("Error on NameRef. Only 20 characters maximum !");
	}


}
