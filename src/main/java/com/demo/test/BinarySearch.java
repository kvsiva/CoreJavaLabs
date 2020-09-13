package com.demo.test;

public class BinarySearch {
    private boolean search(int[] arr,int n){
        int l=0;
        int u= arr.length-1;
        while(l<=u){
            int mid=(l+u)/2;
            if (arr[mid]==n){
               return true;
            }else {
                if(arr[mid]<n){
                    l=mid+1;
                }else{
                    u=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={1,2,4,10,20,40,40};
        System.out.println(arr);
        BinarySearch bs=new BinarySearch();
        System.out.println(bs.search(arr,2));
        System.out.println(bs.search(arr,20));
        System.out.println(bs.search(arr,200));
        System.out.println(bs.search(arr,22));
        System.out.println(bs.search(arr,40));

    }
}
