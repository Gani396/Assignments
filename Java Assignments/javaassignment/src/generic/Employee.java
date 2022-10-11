package generic;
import java.util.HashSet;
public class Employee {
	int id;
	String name;
	double salary;
	String department;
	
	public Employee(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<Employee>();
		Employee emp1 = new Employee(123, "Ganesh", 25000, "ece");
		
		set.add(emp1);
		
		for(Employee emp:set) {
			System.out.println(emp.id+" "+ emp.name+ " "+emp.salary+" "+emp.department);
		}
	}

}
