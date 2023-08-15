package Lesson001;

import java.util.Scanner;

public class Questions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* verilen ürünün satış fiyatının içinde %18 kdv %15 kar 
		 * olduğunu biliyoruz. Verilen ürün fiyatının ham fiyatını bulan programı
		 * yazalım.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int fiyat;
		double hamfiyat;
		
		double yurtdisifiyat;
		
		System.out.println("Ürün fiyatı giriniz");
		fiyat = scanner.nextInt();
		hamfiyat = fiyat / ( 1.18 * 1.15);
		System.out.println("Ürün hamfiyatı" + hamfiyat); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
