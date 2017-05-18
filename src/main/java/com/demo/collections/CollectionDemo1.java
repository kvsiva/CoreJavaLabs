package com.demo.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

	public static void main(String args[]) {

		Collection<String> obj = new ArrayList<String>();
		obj.add("Guna");
		obj.add("Mani");
		obj.add("Leela");
        obj.add("Guna");
        
        System.out.println("Collection output:"+obj);
        
	}

}
