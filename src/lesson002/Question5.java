package lesson002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Girilen TL değerini USD çeviren program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dolar Kurunu giriniz.");
		double guncelDolarDegeri =scanner.nextDouble();

		System.out.println("TL Kurunu giriniz.");
		double tldegeri = scanner.nextDouble();
		double hesaplanandolardegeri = tldegeri / (guncelDolarDegeri);
		
		System.out.println("Dolar miktari." +hesaplanandolardegeri +"$" );
		
		
		
	}

}
