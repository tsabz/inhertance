package employee;

public class TestClass {

	public static void main(String[] args) {
//		testing employee class
//		Employee emp = new Employee();
//		
//		emp.setFirstName("Tonia");
//		emp.setLastName("Saba");
//		emp.setEmployeeID(234798);
//		emp.setEmployeeSalary(70000);
//		emp.employeeSummary();
		
//		Testing manager class 
		Manager manager = new Manager();
		manager.setFirstName("Tonia");
		manager.setLastName("Saba");
		manager.setEmployeeID(234798);
		manager.setPositionTitle("Software Engineer");
		manager.setEmployeeSalary(70000);
		manager.setDepartment("IT");
		manager.employeeSummary();
	}
}
