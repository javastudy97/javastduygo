package org.study.oop;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car hCar=new Car();
		
		hCar.carName="HCar";
		hCar.carYear=2022;
		hCar.carCoin=3000;
		hCar.carColer="blue";
		hCar.carCC=2000;
		
		hCar.carInfo();
		
		Car mCar=new Car();	
		
		mCar.carName="HCar";
		mCar.carYear=2022;
		mCar.carCoin=3000;
		mCar.carColer="blue";
		mCar.carCC=2000;
		
		mCar.carInfo();
		
		System.out.println(hCar.getClass()==mCar.getClass());
		
		
	
	}
}
