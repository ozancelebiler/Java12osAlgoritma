package lesson002;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// verilen 2 sayıdan hangisinin büyük olduğunu bulan
		//program
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		System.out.println("1. sayi giriniz");
		num1= scanner.nextInt();
		
		System.out.println("2. sayi giriniz");
		num2= scanner.nextInt();
		
		if(num1 >= num2) {
			System.out.println("Buyuk Sayi = " + num1);	
		}	
		else if (num1==num2) {
			System.out.println("Sayilar esittir. ");
		}	
		else {
			System.out.println("Buyuk Sayi = " +num2);
		}	
			
	
	}

}
