package org.study.oop;

public class RegisterDTOMain {

	public static void main(String[] args) {
		
		RegisterDTO register = new RegisterDTO();
		
		register.setUser_no(1);
		int user_no =register.getUser_no();
		System.out.println(user_no);
		
		register.setUserName("HK");
		String username =register.getUserName();
		System.out.println(username);
		
		register.setUserPhone("010-1111-2222");
		String userphone =register.getUserPhone();
		System.out.println(userphone);
		
		register.setAddress("서울시 노원구");
		String adress =register.getAddress();
		System.out.println(adress);
		
		register.setIndate("2202-11-08");
		String indate =register.getIndate();
		System.out.println(indate);
		
		register.setGrade("3");
		String grade =register.getGrade();
		System.out.println(grade);
		
		register.setCity("서울");
		String city =register.getCity();
		System.out.println(city);
		
		
	}
	
}
