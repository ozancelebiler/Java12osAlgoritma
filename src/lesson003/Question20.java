package lesson003;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi =sc.nextInt();
		int i=1;
		int toplam=0;
		while (sayi != 0) {	
		if(sayi%2 !=0) {
			toplam = toplam +sayi;			
		}
		sayi--;		
		}
		System.out.println(toplam);
				
	}

}
