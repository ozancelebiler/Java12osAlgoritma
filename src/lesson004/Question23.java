package lesson004;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// TODO girilen sayı için çarpım tablosu veren program
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayi= sc.nextInt();
		int islem=0;
		
		for (int i = 1; i <= 10; i++) {
			islem =sayi*i;
			System.out.println(sayi +" x " +i+ "=" +islem);
		}
			// System.out.println(islem);
			
		}
		
		
	}


