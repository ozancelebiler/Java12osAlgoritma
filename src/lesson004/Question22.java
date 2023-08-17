package lesson004;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Girilen sayının asal olup olmadığını bulan program
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayi= sc.nextInt();
		
		boolean sayac=true;
		
		for (int i = 2; i < sayi; i++) {
			if (sayi %i ==0) {
				sayac=false;
				break;
			}		
		}
		if (sayac) {
			System.out.println("asal sayıdır");
		}
		else {
			System.out.println("asal sayı değildir.");
		}
		
		
		

	}

}
