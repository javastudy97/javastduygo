package org.study.oop;

public class MemberDTO {
	private String userId;
	private String userPw;
	private int age;
	

	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserPw(String userPw) {
		this.userPw=userPw;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	
	
}
