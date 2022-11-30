package org.study.oop;

public class PrivateFiledEx {
	
	private String userId;
	private String userPw;
	private int userAge;
	public String addr;
	
	//setters, gatters
	//setter -> private 필드를 외부에 초기화 매서드
	public void setUserId(String userId) {
		
		//필드	==매개 변수(외부입력)
		this.userId=userId;
	}
	//getter-> private 필드를 외부에 호출 매서드
	public String getUserId() {
		return this.userId;
	}
//	userPw, userAge -> setter, getter매서드를 생성
	public void setUserPw(String userPw) {
		
		//필드	==매개 변수(외부입력)
		this.userPw=userPw;
	}
	public String getUserPw() {
		return this.userPw;
	}
	
	public void setUserAge(int userAge) {
		
		this.userAge=userAge;
	}
	public int getUserAge() {
		return this.userAge;
	}
	
	
}
