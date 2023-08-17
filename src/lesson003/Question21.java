package lesson003;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		//Girilen sayi hangi basamakta ve hangi sayı
		Scanner sc = new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi =sc.nextInt();
		
		int basamakSayisi=1;
		int basamak;
		
		while (sayi != 0) {
			basamak= sayi %10;
			sayi= sayi/10;
			System.out.println(basamakSayisi+ "ler basamağı " +basamak);
			basamakSayisi= basamakSayisi*10;
				
		}
	}

}
