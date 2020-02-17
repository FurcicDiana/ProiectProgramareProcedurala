package main;

public class Animal {
	
	private String tipAnimal;
	private String culoare;
	private int varsta;
	
	//constructor implicit
	
	public Animal() 
	{
		this.tipAnimal=" ";
		this.culoare=" ";
		this.varsta=0;
	}
	public Animal (String culoare)
	{
		this.tipAnimal=" ";
		this.culoare=culoare;
		this.varsta=0;
	}

	public Animal(String tipAnimal, String culoare, int varsta)
	{
		this.tipAnimal=tipAnimal;
		this.culoare=culoare;
		this.varsta=varsta;
	}
	public void setAnimal(String tipAnimal) {
		this.tipAnimal=tipAnimal;
	}
	public void setCuloare(String culoare)
	{
          this.culoare=culoare;
	}
	public void setVarsta(int varsta)
	{
		this.varsta=varsta;
	}
	public String getAnimal()
	{
		return tipAnimal;
		
	}
	public String getCuloare()
	{
		return culoare;
	}
	public int getVarsta()
	{
		return varsta;
	
		
	}
}
