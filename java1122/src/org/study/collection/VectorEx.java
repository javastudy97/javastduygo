package org.study.collection;

import java.lang.reflect.Member;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		Vector<Integer> v0 = new Vector<Integer>();

//	Integer i1=new Integer(10);
//	Integer i2=new Integer(20);
//	Integer i3=new Integer(30);
//	Integer i4=new Integer(40);
//	Integer i5=new Integer(50);

		v0.add(new Integer(10));
		v0.add(new Integer(20));
		v0.add(new Integer(30));
		v0.add(new Integer(40));
		v0.add(new Integer(50));

		for (Integer i : v0) {
			System.out.println(i);
		}

		System.out.println("=========");
		Vector<MeberDto> users = new Vector<MeberDto>();

//	MeberDto user1=new MeberDto("m1", "1111", "s111", 11);
//	MeberDto user2=new MeberDto("m2", "2111", "s211", 11);
//	MeberDto user3=new MeberDto("m3", "3111", "s311", 11);
//	MeberDto user4=new MeberDto("m4", "4111", "s411", 11);
//	MeberDto user5=new MeberDto("m5", "5111", "s511", 11);

		users.add(new MeberDto("m1", "1111", "s111", 11));
		users.add(new MeberDto("m2", "2111", "s111", 21));
		users.add(new MeberDto("m3", "3111", "s111", 31));
		users.add(new MeberDto("m4", "4111", "s111", 41));
		users.add(new MeberDto("m5", "5111", "s111", 51));
		System.out.println("=========================");

		System.out.println("for ======");
		//for
		for(int i=0; i<users.size();i++) {
			System.out.print("아이디: " + users.get(i).getUserId() + " ");
			System.out.print("비밀번호: " + users.get(i).getUserPw() + " ");
			System.out.print("이름: " + users.get(i).getUserName() + " ");
			System.out.println("나이: " + users.get(i).getAge());
			
		}
		System.out.println("foreach ======");
		
		// foreach
		for(MeberDto vt: users) {
			System.out.print("아이디: "+vt.getUserId()+" ");
			System.out.print("비밀번호: "+vt.getUserPw()+" ");
			System.out.print("이름: "+vt.getUserName()+" ");
			System.out.println("나이: "+vt.getAge()+" ");			
		}
		System.out.println("Iterator문");
		//Iterator
		Iterator<MeberDto> iter = users.iterator();
		
		while(iter.hasNext()) {
			MeberDto user = iter.next();
			System.out.print("아이디: "+user.getUserId()+" ");
			System.out.print("비밀번호: "+user.getUserPw()+" ");
			System.out.print("이름: "+user.getUserName()+" ");
			System.out.println("나이: "+user.getAge()+" ");	
		}
		
		System.out.println("=========================");

		System.out.println(users.get(0));
		System.out.print("아이디: " + users.get(0).getUserId() + " ");
		System.out.print("비밀번호: " + users.get(0).getUserPw() + " ");
		System.out.print("이름: " + users.get(0).getUserName() + " ");
		System.out.println("나이: " + users.get(0).getAge());

	}

}
