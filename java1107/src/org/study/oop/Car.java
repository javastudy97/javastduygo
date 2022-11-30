package org.study.oop;

public class Car {
	
	//필드
	public String carName;	
	public int carYear;
	public int carCoin;
	public String carColer;
	public int carCC;
	
	
	//기본생성자-> 생략하면 자동으로 생성됨(다른생성자가 없을시)
	
	//인스턴스 매서드 new 
	public void carInfo() {
		System.out.println("이름: "+carName);
		System.out.println("년식: "+carYear);
		System.out.println("가격: "+carCoin);
		System.out.println("색상: "+carColer);
		System.out.println("배기량: "+carCC);
	}
	
	
	
	
	
	
	
	
}
