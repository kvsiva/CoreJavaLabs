package com.demo.mthreading;
//Multithreading using Runnable interface 
class  ChildThread2
    implements Runnable
{	
  Thread t;
  
    public ChildThread2(String name)
    {
       t = new Thread(this);
       t.setName(name);
       t.start();
    }
    public void run()
    {
     for ( int i = 1; i <=5;i ++)
     {
    System.out.println( t.getName()  + "--> " + i);
   try
    {
     Thread.sleep(100);
    }
   catch(InterruptedException ex)     {}
   } // end of for
  } // end of run()
} // end of childthread2
public class MainThread2
{
   public static void main(String args[])
{
    ChildThread2 ct1 = new ChildThread2("Child1");
    
   ChildThread2 ct2 = new ChildThread2("Child2");
    for (int i = 1; i <=5;i ++)
   {
     System.out.println( "Main -->" + i);
    try
    {
     Thread.sleep(100);
    }
   catch(Exception ex) {}
  } // end of for
  try
  {
  // wait until ct1 and ct2 are 
  // terminated
  ct1.t.join();
  ct2.t.join();
  }
  catch(Exception ex) {}

  System.out.println("Main is over");
 }
}

