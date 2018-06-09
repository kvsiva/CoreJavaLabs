package com.demo.network;
//Product Query Client Socket 

// ProductQuery  Client
import java.net.*;
import java.io.*;

public class ProductQueryClient
{
  static final int port =2000;
 
  public static void main(String args[]) 
  {
   try
   {
     // connect to server socket
    Socket s = new Socket("localhost",port);
    System.out.println("Connected To Server");
    // take input and output stream of the socket
    BufferedReader sin = new BufferedReader(new InputStreamReader( s.getInputStream()));
    PrintWriter sout = new PrintWriter(s.getOutputStream(),true);
    
     sout.println( args[0]);
    // wait for output from server
    String price;
    while( (price = sin.readLine())== null);
      System.out.println("Product Price : " + price);
   } // end of try
   catch(Exception ex)
   {  System.out.println(ex.getMessage());
  }
 
 } // end of main

} // end of class

    



