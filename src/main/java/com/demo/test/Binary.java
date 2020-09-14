package com.demo.test;

public class Binary {
    public static boolean isBinary(int number){
        while(number!=0){
            if (number%10>1)
                return false;
            number=number/10;
        }
        return true;

    }
    public static void main(String[] args){
        System.out.println(isBinary(101));
        System.out.println(isBinary(121));
    }
}
