package com.masai;

public class WatchPriceCalculator {
	double getWatchPrice(String watchType, int age, String gender){
		
		double finalPrice=0;
		
		if(watchType.equals("Rolex")) {
			finalPrice=10999+(109.99*13.5)+(109.99*12.5);
			if(gender.equals("female")) {
				finalPrice=finalPrice-(109.99*2);
				if(age>=60) {
					finalPrice=finalPrice-(109.99*3);
				}
			}
			else if(gender.equals("male")&&age>=60) {
				finalPrice=finalPrice-(109.99*3);
			}
		}
		if(watchType.equals("Titan")) {
			finalPrice=7999+(79.99*12.5)+(79.99*7.5);
			if(gender.equals("female")) {
				finalPrice=finalPrice-(79.99*2);
				if(age>=60) {
					finalPrice=finalPrice-(79.99*3);
				}
			}
			else if(gender.equals("male")&&age>=60) {
				finalPrice=finalPrice-(79.99*3);
			}
		}
		
//		
		return finalPrice;
		}
}
