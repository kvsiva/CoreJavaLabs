package com.demo.network;
//Web Browser

// Web Browser

import java.net.*;
import java.io.*;

public class WebBrowser
{
 
 public static void main(String args[]) throws Exception
 { 
   // connect to server with port number 2000

   Socket client = new Socket("localhost",2000);  
   int ch;
   
   PrintWriter clientout = new PrintWriter(client.getOutputStream(),true);

   clientout.println("d:\\jdk1.3\\names.txt");

   InputStream clientin = client.getInputStream();

   // read until EOF
   while ( (ch = clientin.read()) != -1)
       System.out.print((char)ch);
   
 } // end of main

} // end of WebServer        
   

   

