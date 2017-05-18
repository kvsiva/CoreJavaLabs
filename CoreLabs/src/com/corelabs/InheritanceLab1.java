package com.corelabs;

//super  class
class A {
	int n;

	public void print() {
		System.out.println(n);
	}
}

// sub class
class B extends A {
	int m;

	public void print() {
		System.out.println(n + "  " + m);
	}
}

public class InheritanceLab1 {

	public static void main(String args[]) {
		B obj = new B();
		obj.print();
	}

}

class C extends A {
	int m;

	public void print() {
		super.print(); // calls print of class A
		System.out.println(m);
	}

	class D {
		int n;

		public A(int n) {
			this.n = n;
		}
	}

	class E extends D {
		int m;

		public void print() {
		}
	}

	class F {
		int n;

		public F(int n) {
			this.n = n;
		}
	}

	class G extends F {
		public G(int n) {
			super(n); // call A’s constructor )
		}
	}
}