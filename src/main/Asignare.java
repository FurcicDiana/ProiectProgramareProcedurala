package main;

public class Asignare {
public static void main(String[] args) {
		
		int a=3;
		int b=(a=2)*a; // ia valoarea lui a din paranteza 
		int c=b*(b=5); // ia valoarea lui b din paranteza nu cea calculata mai sus
		System.out.println("a=" +a+",b="+b+",c="+c);
	
	
		
		
}
}
