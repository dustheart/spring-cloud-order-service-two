package com.gupaoedu.example.orderservice;

import com.gupaoedu.example.TaobaoOrderService;
import com.gupaoedu.example.dto.OrderDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaobaoOrderServiceImpl implements TaobaoOrderService {

	@Override
	public String orders() {
		return "Return All Taobao Orders";
	}

	@Override
	public int insert(OrderDto dto) {
		return 2;
	}
}
