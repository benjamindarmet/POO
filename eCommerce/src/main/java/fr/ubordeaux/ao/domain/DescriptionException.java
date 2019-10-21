package fr.ubordeaux.ao.domain;

import java.io.IOException;


public class DescriptionException extends Exception{

	public DescriptionException(){
		super("Description to big ! Max : 200 characters !");
	}

}
