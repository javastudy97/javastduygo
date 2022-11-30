package org.study.collection;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		// List<E>인터페이스 슈퍼클래스
		// 순서가 있다.
		// 길이가 자동 조절
		// 객체를 요소로 가지고 있다.
		// 중복값을 허용
		 Vector<Integer> v0 = new Vector<Integer>();
//		 Integer i = new Integer(1000);
//		 Integer i = 1000;//자동 박싱
		 
		 v0.add(new Integer(1000));//박싱 
		 v0.add(2000);//자동박싱
		 v0.add(3000);
		 v0.add(4000);
		 v0.add(5000);
		 
		 System.out.print("백터 v0요소 갯수: "+v0.size());
		 System.out.println(v0);
		 //백터 v0의 모든 요소를 콘솔에 출력 for문 
		 
		 for(int i=0; i<v0.size(); i++) {
			 System.out.print(v0.get(i)+" ");
		 }
		 
		 System.out.println("============");
		 //반복문 -> foreach
		 for(Integer el: v0) {
			 System.out.println(el);
		 }
		 
		 System.out.println();
		 System.out.println(v0.size());
		 
		 
		 v0.add(2, 1500);
		 System.out.println(v0.size());
		
		 for(int i: v0) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 Vector<Integer> v1	= new Vector<Integer>();
		 v1.add(111); 
		 v1.add(211); 
		 v1.add(311); 
		 v1.add(411); 
		 v1.add(511);
		 for(int i: v1) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 v0.addAll(v1);
		 
		 for(int i: v0) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 System.out.println(v0.size());
		 
		 System.out.println(v0.contains(new Integer(1000)));
		 System.out.println(v0.contains(2000));
		 System.out.println(v0.contains(10));
		 if(!v0.contains(10)) {
			 System.out.println("10포함 안됩니다.");
		 }else {
			 System.out.println("10포함 됩니다.");
			 
		 }
		 System.out.println(v0.elementAt(5));
		 System.out.println(v0.indexOf(5000));
		 System.out.println(v0.indexOf(500000));
		 System.out.println(v0.isEmpty());
		 
	
		 System.out.println();
		 
		 v0.remove(0);// 특정 인덱스 요소를 삭제
		 System.out.println(v0.size());
		 
		 for(int i: v0) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 
		 v0.remove(new Integer(1500));//특정요소를 삭제
//		 v0.remove(1500); //특정요소를 삭제 **주의
		 
		 for(int i: v0) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 
//		 v0.clear();
//		 System.out.println(v0+" "+v0.size());
		 
		 System.out.println(v0+" "+v0.size());

		 v0.removeAll(v1); //v0에 있는 인덱스중에서 v1을 제거
		 
		 System.out.println(v0+" "+v0.size());
		 
		 Object[] arrObj = v0.toArray();
		 
		 System.out.println(arrObj);
		 
	}
}
