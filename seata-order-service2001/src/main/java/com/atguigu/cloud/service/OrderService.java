package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * @ClassName OrderService
 * @Author Rain
 * @Date 2024/5/31 01:50
 * @Version 1.0
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
