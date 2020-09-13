package com.demo.test;

public class LinearSeach2 {
    private void traverse(int[] ar){
        for (int j : ar) {
            System.out.println(j);
        }
    }
    private boolean search(int[] ar,int n){

        for(int i=0;i<ar.length;++i){
            if(ar[i]==n) {
                System.out.println("Found at position: "+ i);
                return true;
            }
        }
        System.out.println("Given Element is not found");
        return false;
    }


    public static void main(String[] args){
        int[] arr={10,2,30,12,45,34,46};
        LinearSeach2 ls2=new LinearSeach2();
        ls2.traverse(arr);
        System.out.println(ls2.search(arr,12));
        System.out.println(ls2.search(arr,100));
        System.out.println(ls2.search(arr,200));
        System.out.println(ls2.search(arr,2));

    }

}
