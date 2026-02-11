package tw.hui.spring2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.hui.spring2.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
}
