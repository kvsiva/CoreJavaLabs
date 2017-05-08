//Stack Class - Demostrates problem with shared access and multithreading 

package com.demo.mthreading;

/* 
 This program is used to demostrate what happens
 when two or more threads try to access a shared resource 
 without synchronization.
*/


// Stack class
class MTStack
{
    static final  int SIZE = 10;
    int  ar[] = new  int[SIZE];
    int  pos=0;
    public void  push(int n)
    {
          ar[pos] = n;
          try
          {
              Thread.sleep(100);
          }
          catch(Exception ex ) {}
          pos++;
    }

    synchronized public int pop()
    {
         pos --;
         return ar[pos];
    }
}

class  CThread  extends Thread
{
   MTStack  st;
   public CThread(MTStack st)
   {
           this.st  = st;
   }
   public void run()
   {
     synchronized(st)
     {
          st.push(300);
     }
   }
}
public class MTStackTest
{
    public static void main(String args[])
   {
      MTStack  s = new MTStack();
      CThread  ct = new CThread(s);
      ct.start();
      synchronized(s)
      {
       s.push(100);
       s.push(200);
      }
     
      System.out.println(s.pop());
      System.out.println(s.pop());
      System.out.println(s.pop());

  }
}


