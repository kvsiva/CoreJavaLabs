package com.corelabs;

public class Ex1Lab {

	public static void main(String[] args) {
		int a=10;
		int b=2;
		try{
		System.out.println("a/b:"+a/b);}
		catch (Exception ex){
			ex.printStackTrace();
		
		}
		
		finally{
			System.out.println("Inside finally block");
		}
		
				
	}

}
