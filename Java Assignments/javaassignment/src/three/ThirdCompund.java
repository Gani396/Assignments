package three;
import java.util.*;
public class ThirdCompund {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principle ");
		int p=sc.nextInt();
		System.out.println("Enter Rate");
		int r=sc.nextInt();
		System.out.println("Enter time");
		int t=sc.nextInt();
		System.out.println("Enter no of times interest is compunded");
		int n=sc.nextInt();
		int sI=(p*r*t)/100;
		double cI= p*Math.pow((1+ r/n),(t*n))-p;
		System.out.println("Simple Interest is"+ sI);
		System.out.println("Compound Interest is"+ cI);
	} 
	

}
