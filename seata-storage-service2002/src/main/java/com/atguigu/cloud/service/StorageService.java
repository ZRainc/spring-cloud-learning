package com.atguigu.cloud.service;

/**
 * @ClassName OrderService
 * @Author Rain
 * @Date 2024/6/1 00:05
 * @Version 1.0
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
