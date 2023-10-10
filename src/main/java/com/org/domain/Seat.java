package com.org.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Seat {

    @Id
	@GeneratedValue
    private Integer id;

    @Column(name = "seat_number", nullable = false)
    private String seatNumber;

    @Column(name = "status", nullable = false)
    private String status;


}
