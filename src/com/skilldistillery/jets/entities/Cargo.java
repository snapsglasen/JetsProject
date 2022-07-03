package com.skilldistillery.jets.entities;

public class Cargo extends Jet implements Loading {

	public Cargo(String model, double range, double speed, double price) {
		super(model, range, speed, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadUp() {
		System.out.println("loading her up...");

	}

}
