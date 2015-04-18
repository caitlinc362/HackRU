import java.util.*;

public class Reviewer
{
	private ArrayList<Review> reviews;
	
	public Reviewer()
	{
		reviews = new ArrayList<Review>();
	}
	
	public void addReview(Review r)
	{
		reviews.add(r);
	}
}
