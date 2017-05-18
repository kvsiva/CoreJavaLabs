package com.corelabs;

public class InheritanceLab3 {

	class A1 {
		int n;

		public A1(int n) {
			this.n = n;
		}
	}

	class B1 extends A1 {
		public B1(int n) {
			super(n); // call A’s constructor
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		B1 obj = new B1(20);

	}

}