package org.study.collection;

public class GenericEx1Main<T> {
	
	public static void main(String[] args) {
		
		//제네릭타입 Integer
		GenericEx1<Integer> g1 = new GenericEx1<Integer>();
		
//		g1.t1=new Integer(10);
		g1.t1=10; //자동 박싱
		
//		int num = g1.m1(10).intValue(); //자동 언박싱
		int num = g1.m1(10); //자동 언박싱
		
		//제네릭타입 Integer
		GenericEx1<String> g2= new GenericEx1<String>();
		g2.t1="String type";
		String str1 = g2.m1("문자열");
		
		GenericEx1<Float> g3=new GenericEx1<Float>();
		GenericEx1<Long> g4=new GenericEx1<Long>();
		GenericEx1<Byte> g5=new GenericEx1<Byte>();
		GenericEx1<Double> g6=new GenericEx1<Double>();
		GenericEx1<Short> g7=new GenericEx1<Short>();
		GenericEx1<Character> g8=new GenericEx1<Character>();
		GenericEx1<Boolean> g9=new GenericEx1<Boolean>();
		
	}
}
