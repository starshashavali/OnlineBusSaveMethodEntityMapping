package com.org.dto;

import jakarta.persistence.Column;

public class RouteDTO {
	private Integer id;

	@Column(name = "route_name", nullable = false, unique = true)
	private String routeName;

	@Column(name = "departure_location")
	private String departureLocation;

	@Column(name = "arrival_location")
	private String arrivalLocation;
}
