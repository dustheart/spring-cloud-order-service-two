package com.gupaoedu.example.clients;

import com.gupaoedu.example.TaobaoOrderService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("order-service")
public interface TaobaoOrderServiceFeignClient extends TaobaoOrderService {

}
