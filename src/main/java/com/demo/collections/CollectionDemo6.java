package com.demo.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo6 {

	public static void main (String [] args) {
		Collection <String> vowels = new ArrayList ();
		vowels.add ("A");
		vowels.add ("E");
		vowels.add ("I");
		vowels.add ("O");
		vowels.add ("U");

		// PERCORE ALL THE ELEMENTS OF THE vowels COLLECTION
		for (String vog: vowels) {
			System.out.println ("Vowel:" + vog);
		}
	}
}