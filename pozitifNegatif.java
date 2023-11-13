package deneme;

import java.util.Scanner;

public class pozitifNegatif {
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			Scanner girdi=new Scanner(System.in);
			System.out.println("Sayi giriniz:");
			int sayi=girdi.nextInt();
			if(sayi>0) {
				System.out.println("Pozitif");
			}
			else if(sayi==0) {
				System.out.println("0");
			}
			else {
				System.out.println("Negatif");
			}
			
		}
		
	}


}
