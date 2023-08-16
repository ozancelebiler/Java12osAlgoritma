package lesson003;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// telefona ve mail adresine bir kod gelicek.
		// kullanıcıdan maile ve telefona gelen kodu isteyeceğiz.
		// eğer ona gönderilen kod ile uyuşuyorsa sisteme kayıt
		// oldunuz diyelim.
		// mail veya telefon kod hatalıdır olarak
		// çıktı verelim.
		
		int telefonKod=123;
		int mailKod=456;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("telefon kod girin");
		 int ktelefonkod =sc.nextInt();
		
		 System.out.println("mail kod girin");
		 int kmailKod=sc.nextInt();
		 
		 if (telefonKod==ktelefonkod && mailKod==kmailKod) {
			System.out.println("Sisteme kayıt oldunuz");
		}
		 else if (telefonKod==ktelefonkod && mailKod !=kmailKod) {
			System.out.println("Mail kodu yanlış");
		}
		 else if (telefonKod!=ktelefonkod && mailKod ==kmailKod) {
			System.out.println("Telefon kodu yanlış");
		 }
		 else {
			System.out.println("Telefon ve mail hatalıdır");
		}
		 
	}

}
