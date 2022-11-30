package org.study.interfaceEx;

interface In1{
//	public static final int MAXNUM = 500; // 파이널은 공유할 때 많이 사용
	int MAXNUM = 500; // 생략되어도 자동적으로 final이 붙은 상태다
//  public abstract void in1Method1(); 
	void in1Method1(); // 자동적으로 public abstract가 붙는다.
	default void defaultMethod() {
	  System.out.println("defaultMethod");
  }
}
interface In2 extends In1{
	public abstract void excuteCommend();
}


class In12 implements In2{
// 추상 매소드 무조건 두개는 구현해 준다.
	
	@Override
	public void in1Method1() {
		System.out.println("inMethod1 오버라이딩");
	}

	@Override
	public void excuteCommend() {
		System.out.println("excuteCommend 오버라이딩");		
	}
	
}

public class InterfaceExMain {
	public static void main(String[] args) {
		
		 In12 i12= new In12();
		 In1 i1 = new In12();
		 In2 i2 = new In12();
		 
		 
		 
		 
	}
}
