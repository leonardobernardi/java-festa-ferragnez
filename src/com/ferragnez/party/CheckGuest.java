package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Franscesco Totti", "Ilary Blasi", "Bebe Vio", 
						"Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		String name;
		System.out.println("Inserire il proprio nome: ");
		name = input.next();
		boolean valid = false;
		
//		for (int i = 0; i < invitati.length; i++) {
//			if (invitati[i].equalsIgnoreCase(name)) {
//				System.out.println("Benvenuto " + invitati[i] + "!");
//				valid = true;
//				break;
//			}
//		}
		int i = 0;
		while (!valid && i < invitati.length) {
			if (invitati[i].equalsIgnoreCase(name)) {
				System.out.println("Benvenuto " + invitati[i] + "!");
				valid = true;
			} else {
				i++;
			}
		}
		
		if (!valid) {
			System.out.println("Ci dispiace, non sei sulla lista.");
		}
		
		
		input.close();
	}

}
