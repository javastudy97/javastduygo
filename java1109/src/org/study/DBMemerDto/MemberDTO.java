package org.study.DBMemerDto;

//회원가입 맴버

public class MemberDTO {
	private String userId;
	private String userPw;
	private int userAge;
	private String userName;
	private String userAddr;

	public MemberDTO(String userId, String userPw, int userAge, String userName, String userAddr) {

		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
		this.userName = userName;
		this.userAddr = userAddr;

//		getMemberDto();
	}

	public void getMemberDto() {
		System.out.print("아이디:" + userId + ", ");
		System.out.print("비밀번호:" + userPw + ", ");
		System.out.print("나이:" + userAge + ", ");
		System.out.print("이름:" + userName + ", ");
		System.out.println("주소:" + userAddr);
	}

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

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

}
