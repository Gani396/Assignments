package Tenth;

import java.util.*;

import assingmentFifth.Trader;

public class tenth {

	public static void main(String[] args) {

		Trader t1 = new Trader("abc","warangal");
		Trader t2 = new Trader("bhc","Pune");
		Trader t3 = new Trader("gani","mumbai");
		Trader t4 = new Trader("jai","pune");
		Trader t5 = new Trader("yadav","Delhi");
		
		
		List <Trader> trader = new ArrayList<>();
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
		trader.add(t4);
		trader.add(t5);
		
		
		trader.stream().filter(s->s.getCity().matches("Pune")).sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
		.forEach(System.out::println);
	}

}
