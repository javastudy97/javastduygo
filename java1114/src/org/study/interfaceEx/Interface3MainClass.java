package org.study.interfaceEx;

public class Interface3MainClass {

	public static void main(String[] args) {
		
//		new InterfaceEx3();
		
		InterfaceEx3Main in1 = new InterfaceEx3Main();
		in1.excuteQuery();
		int num1 = in1.MAXNUM;
		in1.name = "InterfaceEx3Main";
		
		System.out.println();
		
		InterfaceEx3 in2=new InterfaceEx3Main();
		in2.excuteQuery();
		int num2 = in2.MAXNUM;
		
	
	}
}
