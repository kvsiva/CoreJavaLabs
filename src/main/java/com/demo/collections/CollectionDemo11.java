package com.demo.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CollectionDemo11 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		Enumeration<String> enum1;
		Iterator<String> iter;
		long start;

		for (int i = 0; i < 1000000; i++) {
			v.add("New Element");
		}

		enum1 = v.elements();
		iter = v.iterator();
		// *****CODE BLOCK FOR ITERATOR**********************
		start = System.currentTimeMillis();
		String element;
		while (iter.hasNext()) {
			element = iter.next();
		}
		System.out.println("Iterator took " + (System.currentTimeMillis() - start));
		// *************END OF ITERATOR BLOCK************************

		// System.gc(); //request to GC to free up some memory
		// *************CODE BLOCK FOR ENUMERATION*******************
		start = System.currentTimeMillis();
		while (enum1.hasMoreElements()) {
			element = enum1.nextElement();

		}
		System.out.println("Enumeration took " + (System.currentTimeMillis() - start));
		// ************END OF ENUMERATION BLOCK**********************
	}
}
