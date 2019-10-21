package fr.ubordeaux.ao.domain;

public class CommandLine{
	
	private Reference ref;
	private int quantity;
	private int  totalPrice;

	public CommandLine(Reference ref, int quantity){
		this.ref = ref; //Use to represent the ID
		this.quantity = quantity;
		this.totalPrice = ref.getPrice().getValue() * quantity;
	}

	private void computePrice(){
		this.totalPrice = quantity * this.ref.getPrice().getValue();
	}

	public int getId(){
		return this.ref.getReferenceId();
	}

	public void changeQuantity(int value){
		if(!(quantity + value < 0))
			this.quantity += value;
		computePrice();
	}

	public int getTotalPrice(){
		return this.totalPrice;
	}



}

