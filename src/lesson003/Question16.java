package lesson003;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		/*	kullanıcıdan 1-7 arası sayı alalım,
		 * günün hafta içi veya h.sonu olduğunu söylesin
		 * 1-5 hafta içi 6-7 haftasonu
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("gün girin");
		 int gun =sc.nextInt();
		 
		 switch (gun) {
		case 1,2,3,4,5:
			System.out.println("gun haftaiçidir");
			break;
		case 6,7:
			System.out.println("gun hafta sonudur");
			break;
			
		default:
			System.out.println("hatalı deger girdiniz");
			break;
		}
		 
		
		
		
	}

}
