package com.demo.iostreams;

//Java Program to illustrate reading from Text File
//using Scanner Class
import java.io.File;
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) throws Exception {
		// pass the path to the file as a parameter
		File file = new File("C:\\Jars\\test.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
	}
}
