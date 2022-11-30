package org.study.Innerclass;

public class InstanceCalssBasic {
	
	class InstanceClass{
		int i =10;
		//static int i2=20; // static 클래스에서만 선언
		final static int Num=100;
//		public final static char[] i2 = null;
	}
	static class StaticInner {
		int i=10;
		static int i2=20;
	}
	public void localMethod() {
		class LocalClass {
			int i =10;
			//static int i2=20;
			final static int NUM=100;
			void local1() {
				System.out.println("local 메서드");
			}
		}
		LocalClass l1 = new LocalClass();
		l1.local1();
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceClass.Num);
		System.out.println(StaticInner.i2);
	}
	

}
