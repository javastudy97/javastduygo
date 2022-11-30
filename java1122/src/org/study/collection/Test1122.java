package org.study.collection;

class A{
	int n;
	String s1;
	int m1() {
		return 0;
	}
}

class G1<T>{
	T t1;
	
	T m1(T t2) {
		return t2;
	}
}




public class Test1122 {

	public static void main(String[] args) {
		
	G1<String> g1 = new G1<String> ();
	g1.t1 = "String";
	String m1 = g1.m1("문자열");
	
	G1<Integer> g2 = new G1<Integer> ();
	g2.t1 = new Integer(10);
	g2.t1 = 10;
	Integer i1 = g2.m1(new Integer(10));
	int i2 = g2.m1(new Integer(10)).intValue();
	int i3 = g2.m1(10);
	
	//기본형
	int i = 10;
	
	String str = new String("문자열");
//	String str2 = "문자열";
	Integer i4 = new Integer(10);
//	Integer i42 = 10;
	
	
	
	MeberDto user1=new MeberDto("m1", "1111", "s111", 11);
	MeberDto user2=new MeberDto("m2", "2111", "s211", 11);
	MeberDto user3=new MeberDto("m3", "3111", "s311", 11);
	MeberDto user4=new MeberDto("m4", "4111", "s411", 11);
	MeberDto user5=new MeberDto("m5", "5111", "s511", 11);

	System.out.println("user1");
	System.out.println("아이디: "+user1.getUserId());
	System.out.println("비밀번호: "+user1.getUserPw());
	System.out.println("이름: "+user1.getUserName());
	System.out.println("나이: "+user1.getAge());
	
	System.out.println();
	
	//객체 user3
	System.out.println("user2");
	System.out.println("아이디: "+user2.getUserId());
	System.out.println("비밀번호: "+user2.getUserPw());
	System.out.println("이름: "+user2.getUserName());
	System.out.println("나이: "+user2.getAge());
	
	System.out.println();
	
	//객체 user3
	System.out.println("user3");
	System.out.println("아이디: "+user3.getUserId());
	System.out.println("비밀번호: "+user3.getUserPw());
	System.out.println("이름: "+user3.getUserName());
	System.out.println("나이: "+user3.getAge());
	System.out.println();
	
	//객체 user4
	System.out.println("user4");
	System.out.println("아이디: "+user4.getUserId());
	System.out.println("비밀번호: "+user4.getUserPw());
	System.out.println("이름: "+user4.getUserName());
	System.out.println("나이: "+user4.getAge());
	System.out.println();
	
	//객체 user5
	System.out.println("user5");
	System.out.println("아이디: "+user1.getUserId());
	System.out.println("비밀번호: "+user1.getUserPw());
	System.out.println("이름: "+user1.getUserName());
	System.out.println("나이: "+user1.getAge());
	System.out.println();
	
	}

}
