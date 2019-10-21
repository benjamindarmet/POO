package fr.ubordeaux.ao.domain;

public class Price{

	private int valueInEuroCents;


	public Price(int price) throws PriceException{
		if( price < 0 ) throw new PriceException();
		this.valueInEuroCents= price;
	}

	public int getValue(){
		return this.valueInEuroCents;
	}

	
	@Override
    	public boolean equals(Object other) {
        	if (! (other instanceof Price)) return false;
        	return this.valueInEuroCents == ((Price)other).valueInEuroCents;
   	 }	

}
