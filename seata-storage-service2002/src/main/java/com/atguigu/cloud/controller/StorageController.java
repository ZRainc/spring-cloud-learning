package com.atguigu.cloud.controller;

import com.atguigu.cloud.response.ResultData;
import com.atguigu.cloud.service.StorageService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName StorageController
 * @Author Rain
 * @Date 2024/6/1 00:08
 * @Version 1.0
 */
@RestController
public class StorageController
{
    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public ResultData decrease(Long productId, Integer count) {

        storageService.decrease(productId, count);
        return ResultData.success("扣减库存成功!");
    }
}

