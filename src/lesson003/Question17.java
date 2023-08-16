package lesson003;

import java.util.Scanner;

public class Question17 {
	
		// 1- 100e kadar olan sayıları yazdıralım.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi =sc.nextInt();		
		int sayac=1;
		

		while (sayac <= sayi) {
			sayac++;
			System.out.print( "," +sayac);
		}
	}
	
	 
	 
}
