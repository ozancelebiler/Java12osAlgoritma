package Lesson001;

import java.util.Scanner;


public class Questions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Github denemesi");
		// ctrl + s 
		// Class isimleri CamelCase biçiminde isimlendirilir.

		// isim soyisim yan yana yazdıran programı yazınız.
		
		Scanner scanner = new Scanner(System.in);
		String isim;
		String soyisim;
		System.out.println("İsim giriniz");
		isim= scanner.next();
		
		System.out.println("Soyisim giriniz");
		soyisim= scanner.next();
		
		System.out.println("Hoşgeldiniz" + isim+ " " + soyisim);
		
		
		
		
	}

}
