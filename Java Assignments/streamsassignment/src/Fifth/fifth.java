package Fifth;

import java.util.ArrayList;
import java.util.List;


import assingmentFifth.News;

public class fifth {
	public static void main(String[] args) {
	
		News news1 = new News(123,"Ganesh","Ramu","International");
		News news2 = new News(321,"mani","Ram","Budget");
		News news3 = new News(215,"gani","Vipin","Sports");
		News news4 = new News(128,"yadav","Vinod","Budget");
		
		
		List <News> news = new ArrayList<News>();
		news.add(news1);
		news.add(news2);
		news.add(news3);
		news.add(news4);
		
		
		long count=news.stream().filter(n->n.getComment().matches("Budget")).count();
		
		System.out.println("Number of times Budget appeared in the Comments " +count);
	}

}
