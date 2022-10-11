package Ninth;

import java.util.ArrayList;
import java.util.List;

import assingmentFifth.Trader;

public class ninth {

	public static void main(String[] args) {

		Trader t1 = new Trader("gani","warangal");
		Trader t2 = new Trader("yadav","hyderabad");
		Trader t3 = new Trader("mahi","Lucknow");
		
		
		 
		List <Trader> trader = new ArrayList<>();
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
		
		
		
		trader.stream().map(Trader::getCity).distinct().forEach(System.out::println);
	}

}
