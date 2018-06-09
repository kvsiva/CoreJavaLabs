package com.demo.network;
//Web Server 

import java.net.*;
import java.io.*;

public class WebServer
{
 
 public static void main(String args[]) throws Exception
 { 
   // create server socket with port number 2000

   ServerSocket server = new ServerSocket(2000,10);

   System.out.println("Web Server Started. Listening on port number 2000");
   String filespec;
   int ch;
   
   while (true)
   {
      // get connection from client 
      Socket client = server.accept();

      BufferedReader br = new BufferedReader( new InputStreamReader(client.getInputStream()));

      OutputStream  clientout = client.getOutputStream();

      // read filespec from client
      while ( (filespec = br.readLine()) == null);

      System.out.println("Processing request for file : " + filespec);
       
      // open the file and send content back to client

      FileReader fr = new FileReader( filespec);

      while ( ( ch = fr.read()) != -1 )
             clientout.write(ch);

      clientout.write(-1);  // write EOF
      clientout.close();
             
      fr.close();

      System.out.println("Process Completed Successfully");

    } // end of while

  } // end of main

} // end of WebServer        
   

   

