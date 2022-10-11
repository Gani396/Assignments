package Fourth;

import java.util.ArrayList;
import java.util.List;

import assingmentFifth.News;

public class fourth {

	public static void main(String[] args) {
		News news1 = new News(123, "Ganesh", "mani", "International");
		News news2 = new News(321, "vishal", "Ram", "Budget");
		News news3 = new News(215, "gani", "Vipin", "Sports");
		
		List<News> news = new ArrayList<News>();
		news.add(news1);
		news.add(news2);
		news.add(news3);
		int n = news.stream().min((p1, p2) -> {
			return (int) p1.getNewsId() + p2.getNewsId();
		}).get().getNewsId();

		System.out.println("News id with max number of comments is" + n);

	}

}
