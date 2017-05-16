package com.demo.iostreams;

//Java Program illustrating that we can read a file in
//a human readable format using FileReader
import java.io.*; // Accessing FileReader, FileWriter, IOException

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader sourceStream = null;
		try {
			//sourceStream = new FileReader("C:\\Users\\Sneha Vihaari\\workspace\\WebServiceLabs\\CoreJavaLabs\\src\\main\\java\\com\\demo\\iostreams\test.txt");
			sourceStream = new FileReader("C:\\Jars\\test.txt");

			// Reading sourcefile and writing content to
			// target file character by character.
			int temp;
			while ((temp = sourceStream.read()) != -1)
				System.out.println((char) temp);
		} finally {
			// Closing stream as no longer in use
			if (sourceStream != null)
				sourceStream.close();
		}
	}
}
