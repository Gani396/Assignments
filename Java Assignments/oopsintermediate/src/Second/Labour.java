package Second;
import java.util.*;
public class Labour extends Employee {
	int overTime;
	int hour;
	public Labour(String name, int employeeId, int departmentId, int salary) {
			super(name, employeeId, departmentId, salary);
}

   @Override
   public void totalSalary(){
	   System.out.println("enter no of hrs of overtime "+ name);
	   Scanner sc = new Scanner(System.in);
	   this.overTime = sc.nextInt();
	   System.out.println(" no of hrs for  overtime ");
	   this.hour=sc.nextInt();
	   int totalpay = this.salary + (hour*overTime);
	   System.out.println("i am a labour my total income is  "+ totalpay);
   }
   
   
   }

