package Sixth;

import java.util.ArrayList;
import java.util.List;

import assingmentFifth.News;

public class sixth {

	public static void main(String[] args) {
		News news1 = new News(123, "Ganesh", "Raj", "International");
		News news2 = new News(321, "hani", "Ram", "Budget");
		News news3 = new News(215, "yadav", "Vipin", "Sports");
		News news4 = new News(128, "mani", "Vinod", "Budget");
		News news5 = new News(123, "gani", "Vipin", "Finance");
		
		List<News> news = new ArrayList<News>();

		news.add(news1);
		news.add(news2);
		news.add(news3);
		news.add(news4);
		news.add(news5);
		
		
		System.out.println(" user who posted maximum comments");
	 	String  n=news.stream()
		.max((p1,p2)-> {
			return (int) p1.getCommentByUser().compareTo(p2.getCommentByUser());
			}).get().getCommentByUser();
	 	System.out.println(n);

	}
}
