package sixth;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		int maxAttempts = 0;
		String username, password;
		while(maxAttempts < 3)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter username:");
			username = s.nextLine();
			System.out.println("Enter password:");
			password = s.nextLine();
			if(username.equals("user") && password.equals("user"))
			{
				System.out.println("welcome : "+ username);
				break;
			}
			else
			{
				System.out.println("Authentication Failed");
			}
			maxAttempts++;
		}
	}

}
