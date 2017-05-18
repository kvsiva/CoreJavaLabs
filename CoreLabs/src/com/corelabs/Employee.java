package com.corelabs;

public class Employee {

	private String name;
	private String address;
	private int number;

	/*public Employee(String name, String address, int number) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}*/
	
	
	/*public Employee() {
		// TODO Auto-generated constructor stub
		//name="Siva";
		//address="Bangalore";
		//number=123;
	}*/


	public static void main(String [] args) {
	      //Employee e = new Employee("George W.", "Houston, TX", 43);
		 Employee e=new Employee();
		 e.setNumber(123);
		 e.setName("siva");
		 e.setAddress("Bangalore");
	     // System.out.println("Employee Name:"+ e.name);
	     // System.out.println("Employee Address:"+ e.address);
	     // System.out.println("Employee Name:"+ e.number);
	    
		  System.out.println("Employee Name:"+ e.getName());
	      System.out.println("Employee Address:"+ e.getAddress());
	      System.out.println("Employee Name:"+ e.getNumber());
	   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	 
	 
	
	
}
