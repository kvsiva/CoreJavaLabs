package com.demo.test;

//Write a function for Fibonacci series.
public class FibonacciSeriesDemo {
    private void printFibonacciSeries(int n){
        int[] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for(int i=2;i<n;++i){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.println(arr[i]);
        }


    }
    public static void main(String[] args){
        FibonacciSeriesDemo obj=new FibonacciSeriesDemo();
        obj.printFibonacciSeries(20);
    }
}
