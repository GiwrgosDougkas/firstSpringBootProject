package src;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {
	private HotelRepository hotelRepository;
	
	public DbSeeder(HotelRepository htl) {
		this.hotelRepository=htl;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Hotel marriot=new Hotel(
				"Marriot",
				130,
				new Address("Paris","France"),
				Arrays.asList(
						new Review("John",8,false),
						new Review("George",10,true)
						)
				);
		
	
	
	
		Hotel flisvos=new Hotel(
				"Flisvos",
				90,
				new Address("Rhodes","Greece"),
				Arrays.asList(
						new Review("Michael",5,false),
						new Review("John",7,true)
						)
				);
		
		Hotel sofitel=new Hotel(
				"Marriot",
				200,
				new Address("Rome","Italy"),
				new ArrayList<>()
				);
		
		//drop all hotels
		this.hotelRepository.deleteAll();
		//add hotel to database;
		List<Hotel> hotesl= Arrays.asList(marriot,flisvos,sofitel);
	}

}
