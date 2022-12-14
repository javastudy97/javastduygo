package org.study.io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test1125 {
	
	public static void main(String[] args) {		
		//List 순서가 있다. -> 구현객체 ArrayList
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// 컬랙션 타입          타입 변수
		for(Integer el:list) {
			System.out.println(el);
		}
		//Set -> 주머니 -> 중복불가능
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		System.out.println(set1);
		
		Iterator<Integer> iter1 = set1.iterator();
		while(iter1.hasNext()) {
			Integer el = iter1.next();
			System.out.println(el);
		}
		//Map -> 키:값<Key,Value> -> key중복불가능, value중복가능
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(new Integer(1), "java");
		map1.put(2, "oracle");
		map1.put(3, "HTML");
		map1.put(4, "javascript");
		map1.put(5, "WEB");
		
		System.out.println(map1);
		
		Set<Integer> keys = map1.keySet();
		Iterator<Integer> iter2	= keys.iterator();
		while (iter2.hasNext()) {
			
			Integer el=iter2.next();
			
			System.out.print(el); //key
			//key에 해당 하는 value
			System.out.println(map1.get(el));
		}
		
	}
}
