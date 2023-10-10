package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.domain.Seat;

public interface SeatRepo extends JpaRepository<Seat, Integer>{

}
