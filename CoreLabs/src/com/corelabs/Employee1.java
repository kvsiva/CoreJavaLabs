package com.corelabs;

public class Employee1 {

	private String name;
	private String address;
	private int number;

	public Employee1(String name, String address, int number) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public Employee1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Employee e = new Employee("George W.", "Houston, TX", 43);
		Employee1 e = new Employee1();
		System.out.println("Employee Name:" + e.name);
		System.out.println("Employee Address:" + e.address);
		System.out.println("Employee No:" + e.number);

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