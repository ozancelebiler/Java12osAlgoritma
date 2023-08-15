package lesson002;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		/* 90 üstü 			AA
		 * 80 ve 90 arası   BB
		 * 70 ve 80 arası   CC
		 * 60 ile 70 arası  DD
		 * 60 tan küçük ise FF
		 *  
		 */
		int not;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Not giriniz.");
		not =scanner.nextInt();
		
		if(not<0 || not > 100) 
			System.out.println("Girilen not 1-100 araliğinda olmali");
		
		else if (not<60) 
			System.out.println("Not değeri FF " +not);
		else if (not >=60 && not< 70)
			System.out.println("Not degeri DD " +not);
		else if(not>= 70 &&  not< 80 )
			System.out.println("Not degeri CC " +not);
		else if(not>= 80 &&  not< 90 )
			System.out.println("Not degeri BB " +not);
		else
			System.out.println("Not degeri AA " +not);
		
			
			
		
		
		

	}

}
