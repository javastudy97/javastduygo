package org.study.abstractEx;

public class Abstract1Sub1SubSub extends Abstract1Sub1Sub {

	@Override
	public void abstractM3() {
		System.out.println("오버라이드 1");
		
	}

	@Override
	public void abstractM1() {
		System.out.println("오버라이드 2");
		
	}

	@Override
	public void abstractM2(String name) {
		System.out.println(name);
		
	}
	
	
	
}
