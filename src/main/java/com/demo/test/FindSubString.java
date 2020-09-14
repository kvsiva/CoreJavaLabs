package com.demo.test;
//Write a function to find substring in a string.
public class FindSubString {
    private void find(String str,String findStr){
        if (str.contains(findStr)) {
            System.out.println("Substring is found");
        } else {
            System.out.println("Substring is not found");
        }
    }
    public static void main(String[] args){
        String str="Everything is difficult before it becomes easy";
        String findStr="difficult";
        FindSubString fs=new FindSubString();
        fs.find(str,findStr);

    }
}
