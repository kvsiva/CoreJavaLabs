package com.demo.network;
//A Simple Server Socket Program To Send System Date and Time To Client

import  java.net.*;
import  java.io.*;
import  java.util.*;  // required for Date class

public class  SSocket
{
  public static void main(String args[]) throws Exception
  {
    // port no 100 and queue length 10
    ServerSocket ss = new ServerSocket(100,10); 
    while (true)
    {
     Socket cs=ss.accept();  // wait until a client makes a request
     
     //get access to outputstream of the client
     PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);

     // send system date and time to client
     pw.println( new Date().toString());

   } // end of while loop

  } // end of main

} // end of class 
    


