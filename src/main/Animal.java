package main;

public class Animal {
	
	private String tipAnimal;
	private String culoare;
	private int varsta;
	
	
	
	public Animal() 
	{
		tipAnimal=" ";
		culoare=" ";
		varsta=0;
	}
	public Animal ( String tipAnimal)
   {
		this.tipAnimal= tipAnimal;
		this.culoare= "";
		this.varsta = 0 ;
	}
	public Animal ( String tipAnimal, String culoare)
	{
		this.tipAnimal= tipAnimal;
		this.culoare= culoare;
		this.varsta = 0 ;
	}
	public Animal(String tipAnimal, String culoare, int varsta)
	{
		this.tipAnimal=tipAnimal;
		this.culoare=culoare;
		this.varsta=varsta;
	}
	public void setAnimal(String tipAnimal) {
		this.tipAnimal = tipAnimal;
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
	
	public void afiseazaInformatii() {
		System.out.println("Animalul este de tip " + this.tipAnimal+ " , are culoarea " + this.culoare + " si varsta de " +this.varsta+ " ani");
	
		
	}
}
