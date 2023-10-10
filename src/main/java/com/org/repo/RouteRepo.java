package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.domain.RouteDtls;

public interface RouteRepo extends JpaRepository<RouteDtls, Integer>{

}
