package com.ruby.java.ch07.inheritance;

public class LMSTest {
	public static void main(String[] args) {
		Employee e =  new Employee(null, 0, null);
		Professor p = new Professor(null, 0, null);
		Student s = new Student(null, 0, null);
		
		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");
		
		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");
		
		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}

}
