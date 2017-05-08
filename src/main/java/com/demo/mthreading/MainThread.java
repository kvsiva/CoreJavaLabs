package com.demo.mthreading;
// Multithreading using subclass of 
// Thread class 
class  ChildThread extends Thread
{
    public ChildThread(String name)
    {
      setName(name);
    }
    public void run()
    {
     for ( int i = 1; i <=5;i ++)
     {
       System.out.println( getName() + "-->" +  i);
   try
    {
     Thread.sleep(10);
    }
   catch(InterruptedException ex) { ex.printStackTrace();}
   }
 }
}
public class MainThread
{
   public static void main(String args[])
{
    System.out.println("In Main");
    ChildThread ct1 = new ChildThread("Child1");
     ct1.start();
    System.out.println("In Main again");
    for (int i = 1; i <=5;i ++)
   {
     System.out.println( "Main -->" + i);
    try
    {
      Thread.sleep(10);
    }
   catch(Exception ex) {}
  }
}
}

