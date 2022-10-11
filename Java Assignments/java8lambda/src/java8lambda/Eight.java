package java8lambda;
import java.util.*;
public class Eight {
	public void print(List<Integer> list) {
		for(Integer key : list)
			System.out.println(key);
	}
	public static void main (String[] args) {
		List<Integer> list = new ArrayList<>(); 
		Eight e = new Eight(); //object for  class
		list.add(2);
		list.add(3);
		list.add(1);
		
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				e.print(list);
			}
		});
		t1.start();
	}

}
