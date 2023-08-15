package lesson002;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// girilen 3 adet sayının en büyüğünü bulan program

		Scanner scan = new Scanner(System.in);
       
		int sayi1, sayi2, sayi3, enBuyuk; 
		
        System.out.print("1. Sayıyı giriniz: ");
         sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
         sayi2 = scan.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
         sayi3 = scan.nextInt();
         enBuyuk=sayi1;
         if(sayi2> enBuyuk)
        	 enBuyuk=sayi2;        	 
          if (sayi3>enBuyuk)
        	 enBuyuk=sayi3;
         System.out.println("En buyuk sayi " +enBuyuk);
        
	}

}
