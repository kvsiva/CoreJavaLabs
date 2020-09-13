package com.demo.test;

public class LinearSearch {
    private void traverse(int[] ar){
        for (int j : ar) {
            System.out.println(j);
        }
    }
    private void search(int[] ar,int n){
        boolean found=false;
        for(int i=0;i<ar.length;++i){
            if(ar[i]==n){
                System.out.println("Given Element: "+n+ " found at position: "+ i);
                found=true;
                break;
            }
            if(i==ar.length-1 && found==false){
                System.out.println("Given Element: "+n+ "  not found");
            }

        }
    }


    public static void main(String[] args){
        int[] arr={10,2,30,12,45,34,46};
        LinearSearch ls=new LinearSearch();
        ls.traverse(arr);
        ls.search(arr,12);
        ls.search(arr,100);
        ls.search(arr,200);
        ls.search(arr,2);

    }
}
