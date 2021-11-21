package employee;

public class Manager extends Employee {
	String department;
	
	public Manager() {
// Invoking the parent class constructor
		super();
	}
	
//	getters and setters for department
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String deptName) {
		this.department = deptName;
	}
	
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Employee Department: " + department);
	}
	
} // end of class
