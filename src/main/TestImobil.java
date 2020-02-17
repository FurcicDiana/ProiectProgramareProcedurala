package main;

public class TestImobil {
	public static void main(String[] args)
	{
		String tip1="Vila";
		int etaje1=2;
		double pret1=32553;
		
		String tip2="Casa";
		int etaje2=0;
		double pret2=6574;
		
		String tip3="Apartament";
		int etaje3=4;
		double pret3=9849;
		
		Imobil im1 = new Imobil(tip1, etaje1, pret1);
		Imobil im2 = new Imobil(tip2, etaje2, pret2);
		Imobil im3 = new Imobil(tip3, etaje3, pret3);
		
		System.out.println("Primul imobil este o " + im1.gettipCasa() + ", are " + im1.getnrEtaje() + " etaje si costa " + im1.getPret() + "lei");
		System.out.println("Al doilea imobil este o " + im2.gettipCasa() + ", are " + im2.getnrEtaje() + " etaje si costa " + im2.getPret() + "lei");
		System.out.println("Al treilea imobil este un " + im3.gettipCasa() + ", are " + im3.getnrEtaje() + " etaje si costa " + im3.getPret() + "lei");
	}

}
