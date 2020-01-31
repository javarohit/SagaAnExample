package com.rohit.saga.order.service.commandservice;

import com.rohit.saga.order.service.dto.OrderCreateDTO;

import java.util.concurrent.CompletableFuture;

public interface OrderCommandService {

    public CompletableFuture<String> createOrder(OrderCreateDTO orderCreateDTO);
}
