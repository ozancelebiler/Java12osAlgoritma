package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		/*Dairenin çevresini ve alanını yazdıran program
		 * 		 
		 */
		int r;
		final double pi=3.14;
		double alan, cevre;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Yaricap giriniz: ");
        r = scan.nextInt();
        
        if (r <= 0) {
        	System.out.println("yaricap degeri 0'dan büyük olmalidir");
		}
        else {
        	alan = (pi*(r*r));
            cevre= (2*pi*r);
            System.out.println(" Daire alan  " +alan );
            System.out.println(" Daire cevre  " +cevre );
		}
        
       /* alan = (pi*(r*r));
        cevre= (2*pi*r);
        System.out.println(" Daire alan  " +alan );
        System.out.println(" Daire cevre  " +cevre ); */
        
        

	}

}
