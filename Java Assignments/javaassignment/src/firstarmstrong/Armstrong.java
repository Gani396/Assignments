package firstarmstrong;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int b=n; 
		int sum=0;
		while(b>0)
		{
			int m=b%10;
			sum= sum+(m*m*m);
			b=b/10;
		}
		if(sum==n)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong");
		
	}

}
