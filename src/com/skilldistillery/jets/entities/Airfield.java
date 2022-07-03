package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {

	// public Airfield (fleet)
	private List<Jet> fleet = new ArrayList<>();

	public void flyingNames() {
		for (Jet jet : fleet) {
			jet.fly();

		}

	}

	public void fastest() {
		double fastBoi = 0;
		Jet j = fleet.get(0);
		for (Jet jet : fleet) {
			if (jet.getSpeed() > fastBoi) {
				fastBoi = jet.getSpeed();
				j = jet;

			}
		}
		System.out.println(fastBoi + " " + j);
	}

	public void longestRange() {
		double longest = 0;
		Jet j = fleet.get(0);
		for (Jet jet : fleet) {
			if (jet.getRange() > longest) {
				longest = jet.getRange();
				j = jet;
			}

		}
		System.out.println(longest + " " + j);

	}
	
	public void printAll() {
		for (int i = 0; i < getFleet().size(); i++) {
			System.out.println(getFleet().get(i));

		}
	}

	public void loadAll() {

		for (Jet jet : fleet) {
			if (jet instanceof Cargo) {

				System.out.print(jet);
				((Cargo)jet).loadUp();
			}
		}
	}

	public void dogFight() {

		for (Jet jet : fleet) {

			if (jet instanceof Fighter) {

				System.out.print(jet);
				((Fighter)jet).startFight();
			}
		}
	}
	
	
	
	

	@Override
	public String toString() {
		return "Airfield's current fleet: " + fleet + "]";
	}

	public List<Jet> getFleet() {
		return fleet;
	}

	public void setFleet(List<Jet> fleet) {
		this.fleet = fleet;
	}

	{
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.csv"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetStats = line.split(",");
				if (jetStats[0].equals("fighter")) {
					String model = jetStats[1];
					double range = Double.parseDouble(jetStats[2]);
					double speed = Double.parseDouble(jetStats[3]);
					double price = Double.parseDouble(jetStats[4]);
					Fighter f = new Fighter(model, range, speed, price);
					fleet.add(f);
				}

				if (jetStats[0].equals("cargo")) {
					String model = jetStats[1];
					double range = Double.parseDouble(jetStats[2]);
					double speed = Double.parseDouble(jetStats[3]);
					double price = Double.parseDouble(jetStats[4]);
					Cargo c = new Cargo(model, range, speed, price);
					fleet.add(c);
				}

				if (jetStats[0].equals("passenger")) {
					String model = jetStats[1];
					double range = Double.parseDouble(jetStats[2]);
					double speed = Double.parseDouble(jetStats[3]);
					double price = Double.parseDouble(jetStats[4]);
					Passenger p = new Passenger(model, range, speed, price);
					fleet.add(p);
				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}
}
