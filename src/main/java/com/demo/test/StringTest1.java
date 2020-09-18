package com.demo.test;

import java.util.Scanner;
/*
Given two strings of lowercase English letters,  A and B , perform the following operations:

Sum the lengths of  A and B.
Determine if  A is lexicographically larger than B (i.e.: does  B comes before A in the dictionary?).
Capitalize the first letter in  A and  B and print them on a single line, separated by a space.

Sample Input 0

hello
java

Sample Output 0

9
No
Hello Java
 */
public class StringTest1 {

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(capitalize(A)+" "+capitalize(B));
        /* Enter your code here. Print output to STDOUT. */

    }
}
