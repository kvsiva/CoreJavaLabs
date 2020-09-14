package com.demo.test;
// Swap two integers without using temporary variable.
public class Swap {
    public static void main(String[] args){
        int a=100;
        int b=200;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
}
