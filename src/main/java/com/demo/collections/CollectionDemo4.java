package com.demo.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {

	public static void main (String [] args) {
		Collection <String> vowels = new ArrayList<String> ();
		vowels.add ("A");
		vowels.add ("E");
		vowels.add ("I");
		vowels.add ("O");
		vowels.add ("U");
		
		Collection<String> vowels2=new ArrayList<String>();
		vowels2.addAll(vowels);
		System.out.println ("Contains the vowel I?" + vowels.contains ("I"));
		System.out.println ("List of vowels:" + vowels);
		System.out.println ("List of vowels2:" + vowels2);
		
	}

}
