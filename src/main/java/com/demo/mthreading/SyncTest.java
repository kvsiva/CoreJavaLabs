//Sample program to demostrate synchronization
package com.demo.mthreading;
class  Data
{
  public void print()
  {
     for ( int i = 1; i <= 5; i ++)
     {
       System.out.println(i);
       try
       {
        Thread.sleep(100);
       }
       catch(Exception ex) {}
     }
 }
} // end of data

class  CThread1 implements Runnable
{
   Thread  t;
   Data  obj;
   public  CThread1 (Data obj)
   {
     this.obj = obj;
     t = new Thread(this);
     t.start();
   }
   public void run()
   {
    synchronized(obj)
    {
       obj.print();
    }
   }
} // end of CThread
public class  SyncTest
{
   public static void main(String args[]) 
{
   CThread1 t1,t2;
   Data  obj = new Data();   
    t1 = new CThread1(obj);
    t2 = new CThread1(obj);
    System.out.println("Over");
 } // end of main
}

