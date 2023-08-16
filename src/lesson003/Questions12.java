package lesson003;

import java.util.Scanner;

public class Questions12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// girilen tek sayı ve  çift sayı toplamının çift veya
		// tek olduğunu gösteren program
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayi1=sc.nextInt();
		System.out.println("sayı girin");
		int sayi2=sc.nextInt();
		boolean cift;
		int toplam;
	
			
		toplam = sayi1+sayi2;
		
		if(toplam%2==0) {
			cift=true;
			System.out.println("sayi çifttir" +cift);			
		}		
		else {
			cift=false;
			System.out.println("sayı tektir" +cift);
		}
		
		
		
		
		
	}

}
