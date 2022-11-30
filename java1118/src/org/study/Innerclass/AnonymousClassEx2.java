package org.study.Innerclass;

interface I1{
	abstract void i1();
}

class A2 implements I1{

	@Override
	public void i1() {
		System.out.println("A i1오버라이딩");
	}
}
interface I2 extends I1{
	abstract void i2();
}
interface I3 extends I2{
	abstract void i3();
}


public class AnonymousClassEx2 {
	public static void main(String[] args) {
		
		A2 a2= new A2();
		a2.i1();
		
		I1 i11 = new A2();
		i11.i1();
		
		I1 i22 = new I1() {
			@Override
			public void i1() {
				System.out.println("i1오버라이딩");
			}
		};
		
		i22.i1();
		
		I3 i3 = new I3() {
			@Override
			public void i1() {
				System.out.println("i1");
			}
			
			@Override
			public void i2() {
				System.out.println("i2");
			}
			
			@Override
			public void i3() {
				System.out.println("i3");
			}
		};
		
		i3.i1();
		i3.i2();
		i3.i3();
	}
}
