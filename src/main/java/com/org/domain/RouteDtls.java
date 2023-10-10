package com.org.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class RouteDtls {

    @Id
	@GeneratedValue
	private Integer id;

	@Column(name = "route_name", nullable = false, unique = true)
	private String routeName;

	@Column(name = "departure_location")
	private String departureLocation;

	@Column(name = "arrival_location")
	private String arrivalLocation;



	
}