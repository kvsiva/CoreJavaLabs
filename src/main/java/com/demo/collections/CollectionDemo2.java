package com.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj1 = new Employee();
		obj1.setEmpNo(1234);
		obj1.setEmpName("Guna");
		obj1.setAddress("Bengaluru");
		obj1.setPhoneNumber(123456789);

		Employee obj2 = new Employee();
		obj2.setEmpNo(1235);
		obj2.setEmpName("Mani");
		obj2.setAddress("Bengaluru");
		obj2.setPhoneNumber(133456789);

		//ArrayList<Employee> empCollection = new ArrayList<Employee>();
		List<Employee> empCollection = new ArrayList<Employee>();
		empCollection.add(obj1);
		empCollection.add(obj2);

		// Getting Iterator
		Iterator<Employee> itr = empCollection.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println("Employe No:"+emp.getEmpNo());
			System.out.println("Employe Name:"+emp.getEmpName());
			System.out.println("Employe Address:"+emp.getAddress());
			System.out.println("Employe No:"+emp.getPhoneNumber());
		}
	}
}
