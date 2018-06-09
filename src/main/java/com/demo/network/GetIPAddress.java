package com.demo.network;
//Getting IP Address of the given domain using InetAddress Class 


import  java.net.*;
import  java.io.*;


public class  GetIPAddress
{
   public static void main(String args[])  throws Exception
   {
    
    BufferedReader keyboard = new BufferedReader( new InputStreamReader(System.in));
    String domainname;

    while ( true)
    {
      // read domain name
     System.out.print("Enter Domain Name:");
     domainname = keyboard.readLine();
     if ( domainname.equals("end")) break;

     try
     {
       // get IP addresses related to the given domain
       InetAddress ips[] = InetAddress.getAllByName(domainname);
       
       // display ip addresses
       System.out.println("IP Address(es)");
       System.out.println("==============");

       for ( int i = 0; i < ips.length; i ++)
        System.out.println( ips[i].getHostAddress());
     
     }
     catch(UnknownHostException ex)
     {
       System.out.println("Sorry! Host Not Found");
     }
   } // end of while

  } // end of main

} // end of class



