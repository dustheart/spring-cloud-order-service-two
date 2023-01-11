package com.gupaoedu.example.orderservice;

import com.gupaoedu.example.OrderService;
import com.gupaoedu.example.dto.OrderDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl implements OrderService {

	@Override
	public String orders() {
		return "Return All Orders";
	}

	@Override
	public int insert(OrderDto dto) {
		return 1;
	}
}
