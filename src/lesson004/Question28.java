package lesson004;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// Hesap makinesi yapımı
		Scanner sc = new Scanner(System.in);
		String islem="";
		double deger;
		System.out.println("sayı girin");
		 int sayi1= sc.nextInt();
		 
		 System.out.println("sayı girin");
		 int sayi2= sc.nextInt();
		 
		 if(islem.equals("toplama")) {
			deger=sayi1+sayi2;
			System.out.println("toplama işlemi sonucu= "+deger);
		 	}
		 else if (islem.equals("cıkarma")) {
			deger= sayi1-sayi2;	
			System.out.println("Çıkarma islem sonucu= "+deger);
		}
		 else if (islem.equals("carpma")) {
			 deger= sayi1*sayi2;
			 System.out.println("Çarpma islem sonucu= "+deger);
		}
		 else if(islem.equals("bolme")) {
			 deger= sayi1/sayi2;
			 System.out.println("Bolme islem sonucu= "+deger);
		}

		 
}
}