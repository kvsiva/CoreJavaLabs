package com.demo.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSetObj = new TreeSet<String>();
		treeSetObj.add("Balu");
		treeSetObj.add("Ravi");
		treeSetObj.add("Guna");
		treeSetObj.add("Mani");
		treeSetObj.add("Leela");
		// setObj.add("Balu");

		Iterator<String> itr = treeSetObj.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			//itr.remove();
		}
		       
	}

}
