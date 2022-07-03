package com.skilldistillery.jets.entities;

public abstract class Jet {

	private String model;
	private double range;
	private double speed;
	private double price;

	public Jet(String model, double range, double speed, double price) {
		super();
		this.model = model;
		this.range = range;
		this.speed = speed;
		this.price = price;
	}
	
	public void fly() {
		System.out.println(getModel() + " is now flying...");
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", range=" + range + ", speed=" + speed + ", price=" + price + "]";
	}


}
