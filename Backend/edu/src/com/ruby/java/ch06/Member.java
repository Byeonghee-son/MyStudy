package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;
	
	public Member() {
		this("guest");
	//	System.out.println("Member() 생성자 실행");
	}
	
	public Member(String name) {
		this(name,0);
//		System.out.print("Member(String) 생성자 실행 : ");
//		System.out.println(name);
	}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
//		System.out.print("Member(String,int) 생성자 실행 : ");
//		System.out.println(name + " : " + age);
	}
	public String toString() {
		return name + ":"+age;
	}
//	public void setName(String name) {
//		
//	}
	
	public static void main(String[] args) {
		//System.out.println("main() 메서드 실행");
		Member m1 = new Member();
		Member m2 = new Member("Amy");
		Member m3 = new Member("Amy",23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
}
