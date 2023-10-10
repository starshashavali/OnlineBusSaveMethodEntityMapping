package com.org.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.domain.Bus;
import com.org.domain.RouteDtls;
import com.org.domain.Seat;
import com.org.dto.BusDto;
import com.org.exception.RouteNotFoundException;
import com.org.repo.BusRepo;
import com.org.repo.RouteRepo;
import com.org.service.IBusService;

@Service
public class BusServiceImpl implements IBusService {

	@Autowired
	private BusRepo busRepo;

	/*
	 * @Autowired private SeatRepo seatRepo;
	 */

	@Autowired
	private RouteRepo routeRepo;

	@Override
	public String saveBusDtls(BusDto dto) {
		Bus entity = new Bus();
		BeanUtils.copyProperties(dto, entity);

		List<Seat> seats = new ArrayList<>();
		for (Seat seat : dto.getSeats()) {
			seats.add(seat);
		}
		entity.setSeats(seats);

		RouteDtls route = new RouteDtls();

		route.setDepartureLocation(dto.getRoute().getDepartureLocation());
		route.setArrivalLocation(dto.getRoute().getArrivalLocation());
		route.setRouteName(dto.getRoute().getRouteName());
		//route = routeRepo.save(route);
		entity.setRoute(route);
		busRepo.save(entity);
		return "success";
	}

}
