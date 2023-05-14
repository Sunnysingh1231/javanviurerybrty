package com.masai;

public class WatchPriceTester {
	public static void main(String[] args) {
		WatchPriceCalculator wcOne = new WatchPriceCalculator();
		System.out.println(wcOne.getWatchPrice("Titan", 25, "female"));
		System.out.println(wcOne.getWatchPrice("Titan", 61, "male"));
		System.out.println(wcOne.getWatchPrice("Rolex", 61, "male"));
		System.out.println(wcOne.getWatchPrice("Titan", 25, "male"));
	}
}
