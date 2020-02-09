package main;

public class minim {
	public static void main (String[] args)
	{
int[] array = new int[] {11,3,-6,45,49,99,1987,7,444,8888};
int minim=array[0];
int maxim=array[0];
for(int i = 0; i<10; i++) {
	if (array[i]<minim)
		minim=array[i];
	if(array[i]>maxim)
		maxim=array[i];


}

System.out.println("Minimul este: "+minim);
System.out.println("Maximul este: " +maxim);
}
}