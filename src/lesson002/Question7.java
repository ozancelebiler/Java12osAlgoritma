package lesson002;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		int sayi;
		System.out.println("Sayi giriniz.");
		sayi =scanner.nextInt();
		if (sayi %2 ==0) {
			System.out.println("sayi cift sayidir" +sayi);	
		}
		 else {
			System.out.println("sayi tek sayidir " +sayi);
		}

	}

}
