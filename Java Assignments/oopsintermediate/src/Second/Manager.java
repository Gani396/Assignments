package Second;

import java.util.*;
public class Manager extends Employee {
	int incentives;
	public Manager(String name, int employeeId, int departmentId, int salary) {
	super(name, employeeId, departmentId, salary);

}
	@Override
	public void totalSalary(){
		   System.out.println("enter incentives for manager "+ name);
		   Scanner sc = new Scanner(System.in);
		   this.incentives = sc.nextInt();
		   int totalpay = this.salary + incentives;
		   System.out.println("I am a manager my total income is : "+ totalpay);
	   }
}
	