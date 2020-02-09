package main;

public class vector {
	//un program care stocheaza intr-un vector 3 variabile de tip double
public static void main(String[] args) 
{
	double[] vector = new double[3];
	vector[0]=321.1;
	vector[1]=23.65;
	vector[2]=32;
	
	System.out.print("elementele sunt: ");
	for(int i=0;i<3;i++)
	System.out.print(vector[i]+",");
}
}
