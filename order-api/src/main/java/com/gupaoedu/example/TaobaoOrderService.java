package com.gupaoedu.example;

import com.gupaoedu.example.dto.OrderDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface TaobaoOrderService {

	@GetMapping("/taobao/orders")
	String orders();

	@PostMapping("/taobao/order")
	int insert(OrderDto dto);

}
