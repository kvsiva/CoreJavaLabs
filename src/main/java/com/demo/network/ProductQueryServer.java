package com.demo.network;
//Product Query Server Socket 

// ProductQuery  Server

import java.net.*;
import java.io.*;

public class ProductQueryServer
{
  static final String  filename="products.dat";
  static final int port=2000;
  ServerSocket  ssocket;
 
  public static void main(String args[])
  {
    try
    {
     ProductQueryServer  pqs = new ProductQueryServer();
     System.out.println("Starting Product Query Server...");
     pqs.start();
     System.out.println("Product Query Server Started and waiting for queries.");
     pqs.process();
    }
    catch(Exception ex) {  System.out.println(ex); }
  }

  // start server socket
  public void start() throws Exception
  {
     ssocket = new ServerSocket(port,10);
  }

  public void process() throws Exception
  {
     while(true)
     {
       Socket s = ssocket.accept();
      // connected to a client 
      System.out.println("Connected To Client ");
        // read string from client
        BufferedReader br = new BufferedReader( new InputStreamReader(s.getInputStream()));
        String prodname;
        // wait until a name is read
        while (  (prodname=br.readLine())==null);
        System.out.println("Product Name : " + prodname);
        String price = getPrice(prodname);

        // send price back to client
        PrintWriter pw = new PrintWriter( s.getOutputStream(),true);
        pw.println(price);
     } // end of while

  }  // end of process

  public String getPrice(String name) throws Exception
  {
     BufferedReader br = new BufferedReader( new FileReader(filename));
     String prodname,price="";

     while ( (prodname=br.readLine()) != null)
     {
          // read next line 
          price = br.readLine(); 
          if (prodname.equals(name))
             return price;
     }
     return "Product Not Found";

  } // end of getPrice
       
} // end of class

     


