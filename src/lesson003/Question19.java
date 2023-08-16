package lesson003;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// Girilen sayının 5 in kuvveti olup olmadığını bulan
		// program
		Scanner sc = new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi =sc.nextInt();
		boolean kontrol= true;
		while (kontrol == true) {
			if (sayi %5 == 0) {
				sayi= sayi/5;
				if (sayi==1) {
					System.out.println("5 in kuvvetidir.");
				}
	
			} else {
				System.out.println("5 n kuvveti değildir");

			}
			
		}
		

	}

}
