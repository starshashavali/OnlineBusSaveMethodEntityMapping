package com.org.dto;

import java.time.LocalTime;
import java.util.List;

import com.org.domain.RouteDtls;
import com.org.domain.Seat;

import lombok.Data;

@Data
public class BusDto {
	
	 private Integer id;

	    private String plateName;

	    private Integer seatsBooked;

	    private Integer totalSeats;

	    private List<Seat> seats;

	    private RouteDtls route;

	    private LocalTime dailyStartTime;

	    private LocalTime dailyStopTime;

	    private String busType;


}
