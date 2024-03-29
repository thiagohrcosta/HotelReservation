package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("How many rooms will be rented? ");
		
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			System.out.println("Rent #" + i + " : ");
			System.out.println("Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email : ");
			String email = sc.nextLine();
			System.out.println("Room n� : ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy Rooms : ");
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println("Number #" + i + " Name: " + vect[i].getName() + " | " 
						+ vect[i].getEmail()
						+ "");
			}
		}
		


	}

}
