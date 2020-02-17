package main;

public class TestAnimal {
	public static void main(String[] args)
	{
		Animal animal1=new Animal();
		
		animal1.setAnimal("pisica");
		animal1.setCuloare("neagra");
		animal1.setVarsta(1);
		
	Animal animal2=new Animal("gri");
	animal2.setAnimal("cal");
	animal2.setVarsta(4);
	
	Animal animal3=new Animal(" papagal", "rosu" ,(3));
	
	System.out.println("Animalul este o "+ animal1.getAnimal()+" de culoare "+animal1.getCuloare()+" si are varsta de "+animal1.getVarsta()+ " an");
	System.out.println("Animalul este un " + animal2.getAnimal()+" de culoare "+animal2.getCuloare()+" si are varsta de "+animal2.getVarsta() + " ani");;
	System.out.println("Animalul este un " + animal3.getAnimal()+" de culoare "+animal3.getCuloare()+" si are varsta de "+animal3.getVarsta()+ " ani");;
	}
}

		
		
	


