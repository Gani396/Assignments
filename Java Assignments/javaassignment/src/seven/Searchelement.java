package seven;
import java.util.*;


public class Searchelement {
	public static void  main(String[] args) {
		int [] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to search");
		int n = sc.nextInt();
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==n)
			{ 
				flag=1;
				System.out.println(n+"is present at "+ (i+1)+ "index");
			}
		}
		if(flag==0)
			System.out.println("not present in array");
		
	}

}
