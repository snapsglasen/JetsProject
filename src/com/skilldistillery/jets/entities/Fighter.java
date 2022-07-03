package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements Engaging {

	public Fighter(String model, double range, double speed, double price) {
		super(model, range, speed, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startFight() {
		System.out.println("now engaging...");
	}

}
