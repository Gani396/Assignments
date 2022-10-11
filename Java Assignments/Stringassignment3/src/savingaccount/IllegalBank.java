package savingaccount;

import java.util.Scanner;
class IllegalBankTranscationException extends RuntimeException{
	
}
public class IllegalBank {
	Scanner sc = new Scanner(System.in);
	
	public void withdrawal(double a) 
	{
		System.out.println("Enter your Id");
		long id = sc.nextLong();
		System.out.println("enter your balanace");
		double b = sc.nextDouble();
		try {
			if (a>0)
			{
				System.out.println("Balance= "+ b);
			}
			else {
				throw new IllegalBankTranscationException();
			}
		}
		catch(IllegalBankTranscationException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		IllegalBank s = new IllegalBank();
		s.withdrawal(-2000);
	}
	

}



