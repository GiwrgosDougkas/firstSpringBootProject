package src;

import java.util.List;
import java.util.ArrayList;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Hotels")
public class Hotel {
	@Id
	private String id;	
	private String name;
	@Indexed(direction = IndexDirection.ASCENDING)
	private int pricePerNight;
	private Address address;
	private List<Review> reviews;
	
	protected Hotel() {
		reviews=new ArrayList<>();
	}
	
	public Hotel(String name, int pricePerNight, Address address2,List<Review> rev ) {
		this.name=name;
		this.pricePerNight=pricePerNight;
		this.address=address2;
		this.reviews=rev;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPricePerNight() {
		return this.pricePerNight;
	}
	
	public Address getAddres() {
		return this.address;
	}
	
	public List<Review> getReviews(){
		return this.reviews;
	}
}
