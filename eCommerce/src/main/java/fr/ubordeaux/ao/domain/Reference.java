package fr.ubordeaux.ao.domain;


public class Reference{

	private int id;
	private Name name;
	private Description description;
	private Price price;

	public Reference(int id, String name, String desc,int  price){
		try{
			this.id = id ;
			this.name = new Name(name);
			this.description = new Description(desc);
			this.price = new Price(price);
		}catch(Exception e){
			System.exit(0);
		}
	}

	public boolean equalsTo(Object other){
		if(!(other instanceof Reference)){
			return false;
		}
		Reference otherRef = (Reference) other;
		return (this.id == otherRef.getReferenceId()) && this.name.equals(otherRef.getName()) 
			&& this.description.equals(otherRef.getDescription()) && this.price.equals(otherRef.getPrice()); 

	}

	public int getReferenceId(){
		return this.id;
	}

	public Name getName(){
		return this.name;
	}

	public Description getDescription(){
		return this.description;
	}

	public Price getPrice(){
		return this.price;
	}


}
