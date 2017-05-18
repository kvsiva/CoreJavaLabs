package com.demo.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj=new Employee();
		obj.setEmpNo(1234);
		obj.setEmpName("Guna");
		obj.setAddress("Bengaluru");
		obj.setPhoneNumber(123456789);
		
		Collection<Employee> empCollection=new ArrayList<Employee>();
		
		empCollection.add(obj);
		System.out.println("Employee No:"+obj.getEmpNo());
		System.out.println("Employee Name:"+obj.empName);
		System.out.println("Employee Address:"+obj.getAddress());
		System.out.println("Employee Phone Number:"+obj.getPhoneNumber());
		
	}

}
