package com.demo.iostreams;

//Code using Scanner Class
import java.util.Scanner;
class ScannerDemo
{
  public static void main(String args[])
  {
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter an integer and String");
      int a = scn.nextInt();
      String b = scn.nextLine();
      System.out.printf("You have entered:- "
              + a + " " + "and name as " + b);
  }
}
