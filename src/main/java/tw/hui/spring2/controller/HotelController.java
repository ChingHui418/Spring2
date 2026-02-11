package tw.hui.spring2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tw.hui.spring2.entity.Hotel;
import tw.hui.spring2.repository.HotelRepository;
import tw.hui.spring2.service.HotelService;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    private final HotelRepository hotelRepository;
	
	@Autowired
	private HotelService hotelService;
	
	HotelController(HotelRepository hotelRepository){
		this.hotelRepository = hotelRepository; 
	}
	
	@GetMapping("")
	public ResponseEntity<Map<String, Object>> queryHotelsByPage(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int rpp) {
		
//		Page<Hotel> pageHotel = hotelService.getHotels(page, rpp);
		return ResponseEntity.ok(hotelService.getHotelsV2(page, rpp));

	
	}
}
