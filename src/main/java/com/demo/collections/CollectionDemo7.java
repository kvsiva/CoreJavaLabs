package com.demo.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> mapObj=new HashMap<String, String>();
		//Hashtable<String, String> mapObj=new Hashtable<String, String>();
		mapObj.put("Name", "Guna");
		mapObj.put("Address","Bengaluru");
		mapObj.put("Phone","12343425");
		
		System.out.println("Name:"+mapObj.get("Name"));
		
		HashSet<String> setObj=new HashSet<String>();
		
		setObj.add("Siva");
		setObj.add("Arun");
		
		Iterator<String> itr=setObj.iterator();
		
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
