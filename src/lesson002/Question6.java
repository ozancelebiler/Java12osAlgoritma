package lesson002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/* Kullanıcıdan alınan vize ve final notlarını hesaplayarak
		 * geçip geçmediğini gösteren program
		 * 
		 * vize %40 final %60  50 den büyük ise geçsin.
		 */
		int vizenotu, finalnotu;
		double ort;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vize notu girin.");
		 vizenotu =scanner.nextInt();
		System.out.println("Final notu girin.");
		finalnotu =scanner.nextInt();
		
		ort= (vizenotu*0.4) + (finalnotu*0.6);
		
		if (ort > 50) {
			System.out.println("Basarili Ortalama " +ort);
		}
		else {
			System.out.println("Basarisiz Ortalama " +ort);
		}
		
		
	}

}
