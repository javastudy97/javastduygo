package org.study.Innerclass;

public class Dao {
	//싱글톤 패턴
	//생성자 private
	private Dao() {
		System.out.println("Dao");
	}
	private static class InnerClass{
		//인스턴스 1번만 생성
		private static final Dao INSTANCE = new Dao();
	}
	public static Dao getInstance() {
		return InnerClass.INSTANCE;
	}
	
	public void insert() {}
	public void delete() {}
	public void update() {}
	public void select() {}
}
