package lesson004;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// Girilen sayının mükemmel olup olmadığını bulunuz
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayi= sc.nextInt();
		int toplam =0;
		for (int i = 1; i < sayi; i++) {
			if (sayi%i==0) {
				toplam +=i;
			}
		}
			if (toplam==sayi) {
				System.out.println("mukemmel sayidir");
			}
			else {
				System.out.println("Mukemmel sayi değildir");
			}
		}
	}


