package com.demo.collections;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> setObj=new HashSet<String>();
		setObj.add("Balu");
		setObj.add("Ravi");
		setObj.add("Guna");
		setObj.add("Mani");
		setObj.add("Leela");
		//setObj.add("Balu");
		
		Iterator<String> itr=setObj.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
