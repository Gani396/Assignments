package Second;

public class Employee {
	String name;
	int employeeId;
	int departmentId;
	int salary;
	public Employee (String name, int employeeId, int departmentId, int salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.departmentId = departmentId;
		this.salary=salary;
		
	}
	public void totalSalary() {
		System.out.println("AN employee slary" + salary);
		
		
	}

}
