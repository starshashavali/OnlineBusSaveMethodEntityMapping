package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.domain.Bus;

public interface BusRepo extends JpaRepository<Bus, Integer>{

}
