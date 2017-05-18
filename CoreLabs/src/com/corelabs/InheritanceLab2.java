package com.corelabs;

//super class
class C {
	int n;

	public void print() {
		System.out.println(n);
	}
}

// sub class
class D extends C {
	int m;

	public void print() {
		super.print(); // calls print of class C
		System.out.println(m);
	}
}

public class InheritanceLab2 {

	public static void main(String args[]) {
		C obj = new C();
		obj.print();
	}

}