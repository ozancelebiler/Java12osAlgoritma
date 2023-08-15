package lesson002;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Kenar uzunları girilen ücgenlerin cesidini bulan program
		int kenar1, kenar2, kenar3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kenar1 giriniz.");
		kenar1 =scanner.nextInt();
		
		System.out.println("Kenar2 giriniz.");
		kenar2 =scanner.nextInt();
		
		System.out.println("Kenar3 giriniz.");
		kenar3 =scanner.nextInt();
		
		
		if (kenar1 < 0 || kenar2 < 0 || kenar3 < 0 ) {
			
			System.out.println("Girilen kenar uzunluklari pozitif tam sayi olmalidir");
		}
		if (kenar1== kenar2 && kenar2 == kenar3) {
			System.out.println("Eskenar ucgendir");			
		}
		else if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3) {
			System.out.println("İkizkenar ucgendir");
		}
		else {
			System.out.println("Cesitkenar ucgendir");
		}
		
		
	}

}
