package org.study.oop;

public class CarBasicMain {
	// 필드를 초기화 하고 콘솔에 출력
	public static void main(String[] args) {

		CarBasic car = new CarBasic();
		// getters,setters를 이용해서 실행
		car.setCarName("Car2022");
		car.setCarYear(2022);
		car.setCarCoin(3100);

		System.out.print(" 이름: " + car.getCarName());
		System.out.print(" 년식: " + car.getCarYear());
		System.out.println(" 가격: " + car.getCarCoin());
		System.out.println();
		// 기본생성자 생성자.
		CarBasic car1 = new CarBasic();
		car1.setCarName("MCar2022");
		car1.setCarYear(2022);
		car1.setCarCoin(3600);

		System.out.print(" 이름: " + car1.getCarName());
		System.out.print(" 년식: " + car1.getCarYear());
		System.out.println(" 가격: " + car1.getCarCoin());
		System.out.println();
		// 생성자2
		CarBasic car2 = new CarBasic("DCAR2202");
		car2.setCarYear(2022);
		car2.setCarCoin(3500);

		System.out.print(" 이름: " + car2.getCarName());
		System.out.print(" 년식: " + car2.getCarYear());
		System.out.println(" 가격: " + car2.getCarCoin());
		System.out.println();
		// 생성자3
		CarBasic car3 = new CarBasic("ECAR2202", 2022);
		car3.setCarCoin(3000);

		System.out.print(" 이름: " + car3.getCarName());
		System.out.print(" 년식: " + car3.getCarYear());
		System.out.println(" 가격: " + car3.getCarCoin());
		System.out.println();
		// 생성자4
		CarBasic car4 = new CarBasic("FCAR2202", 2022, 1500);

		System.out.print(" 이름: " + car4.getCarName());
		System.out.print(" 년식: " + car4.getCarYear());
		System.out.println(" 가격: " + car4.getCarCoin());
		System.out.println();
	}
}
