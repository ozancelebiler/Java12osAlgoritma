package lesson003;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// girilen sayının basamak toplamını bulun
		// 123 1+2+3=6
		Scanner sc = new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi =sc.nextInt();
		int toplam=0;
		
		while (sayi!=0) {
			toplam = (sayi%10) + toplam;
			sayi /=10;	
		}
			System.out.println(toplam);
		
		
	}

}
