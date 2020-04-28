package src;

public class Address {
	private String city;
	private String country;
	
	
	public Address(String city, String country) {
		this.city=city;
		this.country=country;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getCounty() {
		return this.country;
	}
}
