package org.study.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		System.out.println("ArrayList");
		
		 ArrayList<Integer> list1 = new ArrayList<Integer>();
//		 Integer i1=new Integer(10);
		 
		list1.add(new Integer(10));
		list1.add(new Integer(20));
		list1.add(new Integer(30));
		list1.add(new Integer(40));
		list1.add(new Integer(50));
		
		//foreach
		for(Integer el:list1) {
			System.out.print(el+" "); // 모든 컬렉션요소를 get
		}
		System.out.println();
		
		Iterator<Integer> iter = list1.iterator();
		while(iter.hasNext()) {
			Integer el = iter.next();
			System.out.print(el+" ");
		}
		
		System.out.println();
		
		System.out.println(list1.size());
		System.out.println(list1.add(1000));
		list1.add(2,1000);
//		list1.clear();
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		
		
	}
}
