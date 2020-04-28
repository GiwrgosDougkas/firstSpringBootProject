package src;

public class Review {
	private String username;
	private int rating;
	private boolean approved;
	
	public Review(String username,int rating, boolean approved) {
		this.username=username;
		this.rating=rating;
		this.approved=approved;
	}
	
	public String getUserName() {
		return this.username;
	}
	
	public int getRating() {
		return this.rating;
	}
	
	public boolean isApplroved() {
		return this.approved;
	}
}
