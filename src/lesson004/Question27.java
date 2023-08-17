package lesson004;

import java.util.Scanner;

import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

public class Question27 {

	public static void main(String[] args) {
		/* klavyeden girilen 0 ile 100 arasında 5 adet sayının
		*	en büyük ve en küçük olanı bulalım
		*
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int enBuyuk=Integer.MIN_VALUE;
		int enKucuk=Integer.MAX_VALUE;
		
		for (int i = 0; i < 4; i++) {		
			System.out.println("sayı girin");
			 int sayi= sc.nextInt();
			
			if (sayi>enBuyuk) {
				enBuyuk=sayi;
	
			}
			if (sayi<enKucuk) {
				enKucuk=sayi;			
			}
			//System.out.println(enKucuk +enBuyuk );
		}
		System.out.println("en kucuk "+enKucuk+  "en büyük" +enBuyuk );
		
	}

}
