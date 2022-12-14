package org.study.gui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface In1{
	abstract void ab1();
}
class InnerClassEx{
	//내부클래스
	//인스턴스 클래스
	class InstanceClass{
		int num1;
	}
	//static 클래스
	static class StaticClass{
		static final int NUMMAX=100;
	}
	void intstanceMathod() {
		//지역클래스
		class InstanceClass{
			void inM() {
				System.out.println("인스턴스 클래스");
			}
		}
		InstanceClass in1 = new InstanceClass();
		in1.inM();
	}
}

public class Test1128 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
		System.out.println(list.remove(list));
		for(Integer lists: list) {
			System.out.println("list+");
		}
		System.out.println();
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			Integer lists = iter.next();
		}
		System.out.println();
		
		//익명 클래스
		new In1() {
			
			@Override
			public void ab1() {
				System.out.println("In1 오버라이딩");
			}
		}.ab1(); 
		//람다식
		
		In1 i1 =()->{
			System.out.println("람다식");
		};
		i1.ab1();
		
//		System.out.println("컴파일 에러")
		System.out.println("실행중(Run Time)에러");
		
		
		int[] intArr=new int[3];
		
		//예외(치명적인 에러가 아닌, 무시정도의 에러)
		try {
		intArr[4]=10;//예외
		System.out.println("예외가 발생되지 않았다.");
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열의 인덱스 초과 예외 발생");
		}
		
		System.out.println("프로그램 종료");
		
		
	}
}
