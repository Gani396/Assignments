package Twelth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import assingmentFifth.Trader;

public class twelth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trader t1 = new Trader("ganesh","Indore");
		Trader t2 = new Trader("jahu","Pune");
		Trader t3 = new Trader("abc","Lucknow");
		Trader t4 = new Trader("kan","Indore");
		Trader t5 = new Trader("mai","Delhi");
		
		
		List <Trader> trader = new ArrayList<>();
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
		trader.add(t4);
		trader.add(t5);
		
		
		List<Trader> result = trader.stream().filter(s->s.getCity().matches("Indore")).collect(Collectors.toList());
		
		if(result.isEmpty())
			System.out.println("No traders based in Indore");
		else
			System.out.println("Some traders are based in Indore");
	}

}
