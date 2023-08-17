package lesson004;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// TODO Kullanıcıdan taban ve üs değeri alınacak
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayi= sc.nextInt();
	
		System.out.println("üs girin");
		int us= sc.nextInt();
		int deger=1;
		
		for (int i = 1; i <= us; i++) {
			deger= sayi*deger;
			
		}
		System.out.println(deger);
		System.out.println(sayi + " üzeri " + us+ ": "+deger);
		
		
		
		
	}

}
