package org.study.inheritance;

public class OverrideParentMain {
	
	public static void main(String[] args) {
		
		OverrideSub1 over1 = new OverrideSub1();
		OverrideSub2 over2 = new OverrideSub2();
		OverrideSub3 over3 = new OverrideSub3();
		
		over1.excuteQuery(100);
		over2.excuteQuery(200);
		over3.excuteQuery(300);
		
		
		
	}
}
