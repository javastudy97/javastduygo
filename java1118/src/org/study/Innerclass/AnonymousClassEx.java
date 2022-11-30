package org.study.Innerclass;

interface In1 {
//	abstract void m1();
	void m1();
}

abstract class AbS1 {
	abstract void mi();
}

class C1 {
	void m1() {
		System.out.println("c1");
	}
}

public class AnonymousClassEx {

	public static void main(String[] args) {

		In1 i1 = new In1() {
			@Override
			public void m1() {
				System.out.println("인터페이스 m1");
			}
		};
		i1.m1();

		AbS1 abS1 = new AbS1() {

			@Override
			void mi() {
				System.out.println("추상클래스 m1");
			}
		};
		abS1.mi();

		C1 c1 = new C1() {
			@Override
			void m1() {
				System.out.println("일반클래스 ");
			}
		};
		c1.m1();

//		new C1();

	}
}
