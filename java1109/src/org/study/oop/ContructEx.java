package org.study.oop;

public class ContructEx {

	private String userId;
	private String userPw;
	private int age;
	
	
	public ContructEx() {
		System.out.println("기본생성자");
	}
	public ContructEx(String userId) {
		System.out.println("생성자2");
		this.userId=userId;
	}
	public ContructEx(String userId, String userPw) {
		System.out.println("생성자3");
		this.userId=userId;
		this.userPw=userPw;
	}
	public ContructEx(String userId, String userPw, int age) {
		System.out.println("생성자4");
		this.userId=userId;
		this.userPw=userPw;
		this.age=age;
	}
	
	
	// getters,setters

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
//	public String toString() {
//		
//		String info = "아이디:"+userId+", 비밀번호: "+userPw+", 나이: "+age;
//		return info;
//	}
	public void info() {
		
		System.out.println("아이디:"+userId+", 비밀번호: "+userPw+", 나이: "+age); 
		
	}
	
}
