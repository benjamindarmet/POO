package fr.ubordeaux.ao.domain;

public class Description{

	private String description;

	public Description(String s) throws DescriptionException {
		if(s.length() > 200){
			throw new DescriptionException();
		}
		this.description = s;
	}

	public String getDescription(){
		return this.description;
	}


}
