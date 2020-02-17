package main;

public class ExempluDebug {
	public static void main(String[] args)
	{
		int n=5;
		int suma = 0;
		System.out.println(n);
		
		for(int i = 1; i<= n; i++) {
			suma = suma + i*i;
			
		}
		System.out.println("Suma: " + suma);
	}
}
