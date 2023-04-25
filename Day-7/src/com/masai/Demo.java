package com.masai;



public class Demo {
	
//	void funmain() {
//		System.out.println("i am from Demo");
//	}
////	@Override
//	void funB2() {
//		System.out.println("i am Boooooo2");
////		super.funB2();
//	}
//	
//	public static void main(String[] args) {
//		Demo d1=new Demo();
//		d1.funB2();
		
//		A d2=new A();
//		d2.funA2();
//		d2.funA1();
//		d2.funB2();
		
//		A www = new B();
//		www.funA1();
//		www.funA2();
//		www.funB2();
//		
//		B ww2= new B();
//		ww2.funA1();
//		ww2.funA2();
//		ww2.funB1();
//		ww2.funB2();
//		
//		A ww3=new B();  //upcosting
//		ww3.funA1();
//		ww3.funA2();
//		ww3.funB2();
	
	public Object fun1(int x) {
		
	if(x>10) {
		return new B();
	}
	else {
		return new A();
	}
	
	}
	
	public static void main(String[] args) {
		Demo d2=new Demo();
		
		Object obj=d2.fun1(43);
		if(obj instanceof A) {
			A a1=(A)obj;
			a1.funA2();
		}
		else {
			B b1=(B)obj;
			b1.funB2();
		}
	}
	
}
