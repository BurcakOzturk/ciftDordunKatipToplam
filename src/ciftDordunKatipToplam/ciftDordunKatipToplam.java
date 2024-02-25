package ciftDordunKatipToplam;

import java.util.Scanner;

public class ciftDordunKatipToplam {

	public static void main(String[] args) {

		int sayi,toplam=0;		
		Scanner input = new Scanner(System.in);
		
		
		do {
		System.out.print("Sayı giriniz : ");
		sayi = input.nextInt();
		if (sayi%4==0) {
			
			toplam=toplam+sayi;								
		}
		} while(sayi%2==0);
	
		System.out.println("Girdiğiniz sayılardan dördün katı olan sayıların toplamı : "+toplam);
		
	}

}
