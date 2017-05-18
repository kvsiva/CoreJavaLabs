
public class Employeedetails {

	public int empNo;
	public String empName;
	public double empSalary;

	Employeedetails() {
		empNo = 123;
		empName = "Guna";
		empSalary = 1000.5;

	}

	public void printEmployee(){
	 System.out.println(empNo);
	 System.out.println(empName);
	 System.out.println(empSalary);
	   	   
   }

	public static void main(String[] args) {

		Employeedetails obj = new Employeedetails();

		obj.printEmployee();
	}

}
