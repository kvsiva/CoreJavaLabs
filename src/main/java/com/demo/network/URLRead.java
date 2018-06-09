package com.demo.network;
//Program to read content from a given URL


// Syntax:  URLRead  url
// Example: java URLRead  url

import java.net.*;
import  java.io.*;
public class  URLRead
{
   public static void main(String args[]) throws Exception
   {
    //  create URL object using url given on the command line
    URL  myurl  = new URL(args[0]);
    // get inputstream of the URL
    InputStream is = myurl.openStream();

    int ch;

    while ((ch = is.read()) != -1)
       System.out.print( (char)ch);
   } // end of main

} // end of class 

