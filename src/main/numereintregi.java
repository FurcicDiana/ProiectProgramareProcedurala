package main;

public class numereintregi {
	
	public static void main(String[] args) {
		int[] intArray = new int[] {1,2,3,4,5,6,7};
		double[] doubleArray = new double[intArray.length];
		double aux = 0.05;
		
		for(int i = 0; i < intArray.length; i++)
			doubleArray[i] = intArray[i] + aux;
		
		System.out.print("Elementele noului vector sunt: ");
		for(int i = 0; i < doubleArray.length; i++)
			System.out.println(doubleArray[i] + ", ");
	}

}
