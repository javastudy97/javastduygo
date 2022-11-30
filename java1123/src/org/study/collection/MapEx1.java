package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		
		//1.
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		//1. user1
		//2. user2
		//3. user3
		//4. user4
		//5. user5
		map1.put(new Integer(1), "1번");
		map1.put(1, "2번");
		map1.put(2, "3번");
		map1.put(3, "4번");
		map1.put(4, "5번");
		//3. key저장 -> Set -> keySet() 저장
		Set<Integer> keys = map1.keySet();
		//4.
		Iterator<Integer> map1Run= keys.iterator();
		while(map1Run.hasNext()) {
//			Integer el = map1Run.next();//언박싱
			int key=map1Run.next();//자동언박싱 -> key
			String val = map1.get(key);// -> key에 해당하는 value
			
			System.out.println("key: "+key+",value: "+val);
		}
		
	}
}
