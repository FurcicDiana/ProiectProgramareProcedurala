package main;

public class Pisica extends Animal {

	public Pisica() {
		super();
	}

	public Pisica(String tipAnimal) {
		super(tipAnimal);
	}
		
		public Pisica(String tipAnimal, String culoare) {
			super(tipAnimal, culoare);
			
		}

	public Pisica(String tipAnimal, String culoare, int varsta) {
		super(tipAnimal, culoare, varsta); }
	
		public void afiseazaInformatii() {
			System.out.println("Pisica are culoarea " +this.getCuloare() +", are varsta de "+this.getVarsta()+" ani.");
		}
		
		

}

