package com.demo.iostreams;

//Java program to illustrate reading data from file
//using nio.File
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;

public class Lab5 {
	public static List<String> readFileInList(String fileName) {

		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		}

		catch (IOException e) {

			// do something
			e.printStackTrace();
		}
		return lines;
	}

	public static void main(String[] args) {
		List l = readFileInList("C:\\Jars\\test.txt");

		Iterator<String> itr = l.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
