package fr.ubordeaux.ao.domain;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Basket{

	private Map<Integer,CommandLine> listCommandLines;
	private int totalCommand;
	private boolean validBasket;


	public Basket(){
		this.listCommandLines = new HashMap<Integer,CommandLine>();
		this.totalCommand = 0;
		this.validBasket = false;
	}

	public int addCommandLine(Reference ref,int quantity) throws CommandLineException{
		CommandLine commandLine = new CommandLine(ref,quantity);
		if(!this.listCommandLines.containsKey(commandLine.getId())) throw new CommandLineException("You have already add this command in the basket !");
		this.listCommandLines.put(commandLine.getId(),commandLine);
		this.totalCommand += commandLine.getTotalPrice();
		return commandLine.getId();
	}


	public void  removeCommandLine(int id) throws CommandLineException{
		if(!this.listCommandLines.containsKey(id)) throw new CommandLineException("You can't remove commandLine wich doesn't exist !");
		totalCommand -= this.listCommandLines.get(id).getTotalPrice();
		this.listCommandLines.remove(id);
	}

	public void finishBasket(){
		this.validBasket = true;
	}
}
