package com.demo.iostreams;

//Java Program to illustrate reading from text file
//as string in Java

import java.nio.file.*;;

public class Lab6 {
	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		return data;
	}

	public static void main(String[] args) throws Exception {
		String data = readFileAsString("C:\\Jars\\test.txt");
		System.out.println(data);
	}
}
