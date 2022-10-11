package savingaccount;
import java.util.*;
class InsufficientBalanceException extends RuntimeException{
	
}
public class InsufficientBalance {
	Scanner sc = new Scanner(System.in);
	public void withdrawal(double a) {
		System.out.println("Enter your Id");
		long id = sc.nextLong();
		System.out.println("enter your balanace");
		double b = sc.nextDouble();
		try {
			if (a<=b)
			{
				b = b-a;
				System.out.println("Balance= "+ b);
			}
			else {
				throw new InsufficientBalanceException();
			}
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		InsufficientBalance s = new InsufficientBalance();
		s.withdrawal(2000);
	}
	

}
