package org.java.variableEx;

public class VarEx03 {
	
public static void main(String[] args) {
	System.out.println("변수이름 규칙");
	
//	int int; // 키워드(예약어)를 사용할 수 없다.
//	int 1var;//숫자로 시작하지 않는다.
//	int m var;// 공백 허용 없다.
	int _var1;
	int $var2; //_ , $ 허용가능 그 의외의 특수문자는 불가
//	int var%dd;
//	int var$$dd;
	
	int Var1=10; //대소문자 구분한다.
	int var1=20;
	System.out.println(Var1==var1); 
	
	int avar=10; // 대문자로 시작하는게 안되는거 아닌데 소문자로 시작하는걸 권고
	
	int varNumber; //다른 문자가 시작되면
	
	int 변수=100; //한글은 허용은 되지만 사용하지 말자..
	System.out.println(변수);
	
	}

}
