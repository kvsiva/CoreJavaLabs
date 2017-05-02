package com.demo.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
	public static void main(String args[]) {
		try {
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println("Out of the block");
	}

	//multiple try catch
	public int method(String fileName) {
		// file;
		//byte x;
		try {
			FileInputStream file = new FileInputStream(fileName);
			byte x = (byte) file.read();
		}catch (FileNotFoundException f) // Not valid!
		{
			f.printStackTrace();
			return -1;
		} catch (IOException i) {
			i.printStackTrace();
			return -1;
		}
		return 0;
	}
}
