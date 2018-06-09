package com.demo.network;
//Client socket program to connect to server socket 

/*
  Note:Make sure you have server socket program is already running 
       while running this program 
*/


import java.net.*;
import java.io.*;
public class CSocket
{

  public static void main(String args[]) throws Exception
  {
        // connect to server socket running at port 100 on localhost
	Socket cs = new Socket("localhost",100);

        // get inputstream of the client socket
	InputStream is = cs.getInputStream();

        // convert inputstream to BufferedReader so that one complete
        // line can be read
	BufferedReader br = new BufferedReader( new InputStreamReader(is));

        // read line set from server
	String line = br.readLine();

        // Display line at client
 	System.out.println(line);

  } // end of main

} // end of class  
  

