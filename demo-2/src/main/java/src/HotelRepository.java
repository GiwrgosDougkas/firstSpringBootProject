package src;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {
	Optional<Hotel> findById(String id);
	List<Hotel> findByPricePerNightLessThan(int price);
}
