package org.study.interfaceEx;

abstract class Ab1{
	int num1;
	abstract void ab1M();
}
abstract class Ab2 extends Ab1{
	int num2;
	abstract void ab2M();
}

//class Abc extends Ab1,Ab2
class Abc extends Ab2{

	@Override
	void ab1M() {
		System.out.println("ab1M");
	}

	@Override
	void ab2M() {
		System.out.println("ab2M");		
	}
}

public class AbstractExMain extends Abc {
	
	public static void main(String[] args) {
			Ab1 ab1 = new Abc();
			Ab2 ab2 = new Abc();
			Abc	abc = new Abc();
		
		}
}
