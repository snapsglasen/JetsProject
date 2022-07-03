package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;
import com.skilldistillery.jets.entities.Cargo;
import com.skilldistillery.jets.entities.Fighter;
import com.skilldistillery.jets.entities.Passenger;

public class JetsApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Airfield aF = new Airfield();
		while (true) {
			System.out.println("0: List fleet\n" + "1: Fly all jets\n" + "2: View fastest jet\n"
					+ "3: View jet with longest range\n" + "4: Load all Cargo Jets\n" + "5: Dogfight!\n"
					+ "6: Add a jet to Fleet\n" + "7: Remove a jet from Fleet\n" + "8: Quit\n");

			int input = sc.nextInt();

			if (input == 0) {

				aF.printAll();

			}

			if (input == 1) {

				aF.flyingNames();
			}

			if (input == 2) {
				aF.fastest();
			}

			if (input == 3) {
				aF.longestRange();
			}

			if (input == 4) {
				aF.loadAll();
			}

			if (input == 5) {
				aF.dogFight();
			}

			if (input == 6) {

				System.out.println("Enter jet model.");
				String model = sc.next();
				System.out.println("Enter jet range.");
				double range = sc.nextDouble();
				System.out.println("Enter jet speed (in Machs).");
				double speed = sc.nextDouble();
				System.out.println("Enter jet price.");
				double price = sc.nextDouble();
				System.out.println("Enter type of jet (Cargo, Fighter, or Passenger");
				String jetType = sc.next();

				if (jetType.equals("Cargo")) {
					Cargo addedC = new Cargo(model, range, speed, price);
					aF.getFleet().add(addedC);

				}

				if (jetType.equals("Fighter")) {
					Fighter addedF = new Fighter(model, range, speed, price);
					aF.getFleet().add(addedF);
				}

				if (jetType.equals("Passenger")) {
					Passenger addedP = new Passenger(model, range, speed, price);
					aF.getFleet().add(addedP);
				}

			}

			if (input == 7) {

				System.out.println("Type the digit in order of the jet you would like to remove.");
				for (int i = 0; i < aF.getFleet().size(); i++) {
					System.out.println(i + " " + aF.getFleet().get(i));
				}
				int removal = sc.nextInt() + 1;
				aF.getFleet().remove(removal);

			}

			if (input == 8) {
				System.out.println("Goodbye");
				break;
			}
		}

		sc.close();
	}

}
