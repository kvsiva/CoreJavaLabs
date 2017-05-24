package com.demo.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedHashsetObj = new LinkedHashSet<String>();
		linkedHashsetObj.add("Balu");
		linkedHashsetObj.add("Ravi");
		linkedHashsetObj.add("Guna");
		linkedHashsetObj.add("Mani");
		linkedHashsetObj.add("Leela");
		// setObj.add("Balu");

		Iterator<String> itr = linkedHashsetObj.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
