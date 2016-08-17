package com.testOne;

public class Car extends Vehicle {

	String Color = null;
	int wheels = 0;
	int windows = 0;
	boolean hasTintedWindows = false;
	boolean hasSunroof = false;

	boolean accelerates = true;
	boolean brakes = false;

	public Car() {
	}

	public Car(String color, int wheels, int windows, boolean hasTintedWindows, boolean hasSunroof, boolean accelerates,
			boolean brakes) {
		Color = color;
		this.wheels = wheels;
		this.windows = windows;
		this.hasTintedWindows = hasTintedWindows;
		this.hasSunroof = hasSunroof;
		this.accelerates = accelerates;
		this.brakes = brakes;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public boolean isHasTintedWindows() {
		return hasTintedWindows;
	}

	public void setHasTintedWindows(boolean hasTintedWindows) {
		this.hasTintedWindows = hasTintedWindows;
	}

	public boolean isHasSunroof() {
		return hasSunroof;
	}

	public void setHasSunroof(boolean hasSunroof) {
		this.hasSunroof = hasSunroof;
	}

	public boolean isAccelerates() {
		return accelerates;
	}

	public void setAccelerates(boolean accelerates) {
		this.accelerates = accelerates;
	}

	public boolean isBrakes() {
		return brakes;
	}

	public void setBrakes(boolean brakes) {
		this.brakes = brakes;
	}

	@Override
	public String honkHorn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String automaticDoorLock() {
		// TODO Auto-generated method stub
		return null;
	}

}
