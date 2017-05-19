package com.demo.collections;

import java.util.ArrayList;
import java.util.Collection;

public class ColllectionDemo3 {
	
	public static void main (String [] args) {
		Collection <String> letters = new ArrayList ();
		letters.add ("Guna");
		letters.add ("Mani");
		letters.add ("Leela");
		letters.add ("Hari");
		letters.add ("Vikram");
		letters.add ("Raju");
		
		System.out.println("Letters size:"+letters.size());
			
		if (letters.isEmpty()) {
			System.out.println ("Empty List");
		} else {
			System.out.println ("Contains values ​​->" + letters);
		}
		
		letters.remove("Raju");
		//letters.clear();
		System.out.println("Letters size after removal:"+letters.size());
		
		System.out.println ("Contains values after removal ​​->" + letters);
		
	}
}
