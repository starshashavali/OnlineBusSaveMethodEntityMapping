package com.org.domain;

import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Bus_Dtls")
public class Bus {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "plate_name", nullable = false, unique = true)
	private String plateName;

	@Column(name = "seats_booked")
	private Integer seatsBooked;

	@Column(name = "total_seats")
	private Integer totalSeats;

	@Column(name = "daily_start_time")
	private LocalTime dailyStartTime;

	@Column(name = "daily_stop_time")
	private LocalTime dailyStopTime;

	@Column(name = "bus_type")
	private String busType;

	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "bus_id")
	private List<Seat> seats;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "route_id")
	private RouteDtls route;

}
