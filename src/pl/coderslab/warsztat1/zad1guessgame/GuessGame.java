package pl.coderslab.warsztat1.zad1guessgame;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class GuessGame {

	public static void main(String[] args) {

		askUser();
	}

	static void askUser() {

		Random r = new Random();
		int a = r.nextInt(3);
try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zgadnij jaka to liczba?\n");
		int b = sc.nextInt(); } catch (InputMismatchException e){
			System.out.println("Wyjątek" + e.getMessage());
		}

		while (true) {
			a /= b;
			System.out.println("Zgaduj jeszcze raz \n");
			sc.nextInt();
			sc.close();
		} 
			

		
	}
}
