
public class Review 
{
	private String review;
	private int stars;
	private Restaurant restaurant;
	private Reviewer username;
	private final int MAX_STARS = 5;
	
	public Review(String initReview, int initStars)
	{
		stars = initStars;
		review = initReview;
		
		if(stars > MAX_STARS)
			stars = MAX_STARS;
		if(stars < 0)
			stars = 0;
	}
	
	public String getReview()
	{
		return review;
	}
	
	public int getStars()
	{
		return stars;
	}
	
	public String toString()
	{
		String result = "";
		
		result += "Stars: " + stars +"/" + MAX_STARS + "\n";
		result += "Review: " + review;
		
		return result;
	}
}
