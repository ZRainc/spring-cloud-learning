package com.atguigu.cloud.apis;

import com.atguigu.cloud.response.ResultData;
import com.atguigu.cloud.response.ReturnCodeEnum;
import org.springframework.stereotype.Component;

/**
 * @ClassName PayFeignSentinelApiFallBack
 * @Author Rain
 * @Date 2024/5/30 21:21
 * @Version 1.0
 */
@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi
{
    @Override
    public ResultData getPayByOrderNo(String orderNo)
    {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}
