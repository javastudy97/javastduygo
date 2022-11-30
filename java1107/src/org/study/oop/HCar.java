package org.study.oop;

public class HCar {
		
	public static void main(String[] args) {
	
		Car h1 = new Car();
		h1.carName="HCar";
		h1.carYear=2023;
		h1.carCoin=3000;
		h1.carColer="red";
		h1.carCC=3000;
		
		h1.carInfo();
		
		CarBumfer bumfer1=new CarBumfer();
		bumfer1.carBumferName="HCar Bumfer";
		bumfer1.carBumferPrice=200;
		
		CarHandle hHandle=new CarHandle();
		hHandle.carHandleName= "Hcar Handle";
		hHandle.carHandlePrice=50;
		
		CarChain hChain=new CarChain();
		hChain.carChainName="HCar Chain";
		hChain.carChainPrice=100;
		
	}
}
