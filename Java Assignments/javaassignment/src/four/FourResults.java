package four;
import java.util.*;
public class FourResults {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st subject Marks");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Subject Marks");
		int b=sc.nextInt();
		System.out.println("Enter 3rd Subject marks");
		int c=sc.nextInt();
		if(a>60&&b>60&&c>60)
			System.out.println("passed");
		if(a>60&&b>60||c>60)
			System.out.println("promoted");
		else
			System.out.println("Failed");
			
			
		
		
		
	}

}
