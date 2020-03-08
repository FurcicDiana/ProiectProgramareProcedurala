package main;

public class TestAnimal {
	
	public static void main(String[] args)
	{
		Animal cat = new Animal();
		cat.setAnimal("pisica");
		cat.setCuloare("neagra");
		cat.setVarsta(1);
		
		cat.afiseazaInformatii();
		
	Pisica miau = new Pisica("Pisica","gri",2);
	miau.afiseazaInformatii();
	miau.afiseazaInformatii();
	
	
	
	Caine dog = new Caine("Caine","Negru",3);
	dog.afiseazaInformatii();
	dog.afiseazaInformatii();
	}
}

		
		
	


