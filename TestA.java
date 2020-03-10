package com.capgemini.hasarelation;

public class TestA {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.name);
		p.walk();

		System.out.println("*******************");
		
		System.out.println(p.m.cost);
		System.out.println(p.m.color);
		p.m.write();

	}

}
