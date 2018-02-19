package pl.coderslab.warsztat1.zad1guessgame;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {

		
		
		
		askUser();

	}

	static void askUser() {
		
		Random r = new Random();
		int draw = r.nextInt(101);

		Scanner sc = new Scanner(System.in);
		System.out.println("Zgadnij liczbę: ");
		int guess = sc.nextInt();

		while (draw != guess) {
			if (draw < guess) {
				System.out.println("Za dużo!"+"\n");
				guess = sc.nextInt();
			}

			else if (draw > guess) {
				System.out.println("Za mało!"+"\n");
				guess = sc.nextInt();
			}
		}
		if (draw == guess) {
			System.out.println("Zgadłeś!!!");
			sc.close();
		}

	}
}
