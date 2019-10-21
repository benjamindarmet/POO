package fr.ubordeaux.ao.domain;

import java.io.IOException;

public class PriceException extends Exception{

	public PriceException(){
		super("Negative price ! Not Possible ! Only positive price !\n");
	}

}
