package Second;

public class Main {
	public static void main(String[] args) {
		System.out.println("Method of Employee Class called ");
		Employee e = new Employee("Ganesh", 354, 765, 1000);
		e.totalSalary();
		
		
		System.out.println("Overridden method  of manager");
		Employee m = new Manager("Ganesh", 354, 765, 10756);
		m.totalSalary();
		
		System.out.println("Overridden method  of labour");
		Employee l = new Labour("Ganesh", 354, 7698, 10756);
		l.totalSalary();
		
	}

}
