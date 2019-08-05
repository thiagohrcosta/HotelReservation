package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("How many rooms will be rent? ");
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Rent nº" + i + " : ");
			System.out.println("Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email : ");
			String email = sc.nextLine();
			System.out.println("Room nº : ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
			
		}
		


	}

}
