package com.masai;

public class assin {
	
		double princiPleamount;
		double interestRate;
		double timePeriod;
		
		void setValues(double pa, double tp, double ir){
		    this.princiPleamount=pa;
		    this.interestRate=tp;
		    this.timePeriod=ir;
		}
		
		double getInterestAmount(){
			double interest=(this.princiPleamount*this.interestRate*this.timePeriod)/100;
			return (Math.round(interest * 100))/100.0;
		}
		
		class SimpleInterestTester{
		    public static void main(String args[]){
		    	assin siOne = new assin();
		    	assin siTwo = new assin();
		        siOne.setValues(1005, 2, 7.5);
		        siTwo.setValues(1235.50, 2.5, 8.25);
		        
		        System.out.println("Interest amount for siTwo: " + siTwo.getInterestAmount());
		        System.out.println("Interest amount for siOne: " + siOne.getInterestAmount());
		    }
		}
		
	
}
