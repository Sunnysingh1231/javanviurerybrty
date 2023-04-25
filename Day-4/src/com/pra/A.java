package com.pra;

public class A {
	void fun1(int ab) {
		System.out.println("inside the function of class demo"+ab);
		
	}
	int fun3() {
		int i=23;
		return i;
	}
	public static void main(String[] args) {
		A obj1=new A();
		int num=1990;
		obj1.fun1(num);
		B b1=new B();
		System.out.println();
		b1.fun1();
		System.out.println(b1.x);
		System.out.println(obj1.fun3());
	}
}
