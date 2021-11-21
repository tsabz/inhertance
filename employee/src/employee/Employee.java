package employee;

public class Employee {
	String firstName;
	String lastName;
	String positionTitle;
	int employeeID;
	double salary;

	//	constructor method -   initialize salary field to zero.
	
	public Employee() {
		salary = 0.0;
	}
	
//	setters and getters for firstName
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fname) {
		this.firstName = fname;
	}
	
//	lastName
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lname) {
		this.lastName = lname;
	}
	
//	Position Title
	
	public String getPositionTitle() {
		return positionTitle;
	}
 	
	public void setPositionTitle(String title) {
		this.positionTitle = title;
	}
	
//	employeeID
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
//	Salary
	public double getEmployeeSalary() {
		return salary;
	}
	
	public void setEmployeeSalary(double employeeSalary) {
		this.salary = employeeSalary;
	}
	
//	employeeSummary method - prints all account attributes
	
	public void employeeSummary() {
		String emp = "Employee Name: " + firstName + " " + lastName + "\n"; 
		String emp_id = "Employee_id: " + employeeID + "\n"; 
		String pos = "Title: " + positionTitle + "\n"; 
		String sal = "Salary: " + salary + "\n";
		
		System.out.print(emp + emp_id + pos + sal);
		
	}
	

} //end of employee class
