package top.xsword.order.controller;

import org.springframework.web.bind.annotation.*;
import top.xsword.order.entities.CommonResult;
import top.xsword.order.entities.Page;
import top.xsword.order.entities.UserOrderResponse;
import top.xsword.order.mapper.OrderMapper;
import top.xsword.order.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: ywx
 * Create Time: 2023/4/28
 * Description:
 */
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private UserMapper userMapper;

    @PostMapping("/list")
    public CommonResult<Page<List<UserOrderResponse>>> orderList(@RequestParam Integer page, @RequestParam Integer pers) {
        page = page <= 0 ? 1 : page;
        pers = pers <= 0 ? 10 : pers;
        Integer total = orderMapper.orderTotal();
        List<UserOrderResponse> list = orderMapper.list((page - 1) * pers, pers);
        Page<List<UserOrderResponse>> objectPage = new Page<>(total, list, page, pers);
        return CommonResult.ok(objectPage, "操作成功");
    }

    @PostMapping("/lastOrder")
    public CommonResult<Page<List<UserOrderResponse>>> lastOrder(@RequestParam Integer page, @RequestParam Integer pers) {
        page = page <= 0 ? 1 : page;
        pers = pers <= 0 ? 10 : pers;
        Integer total = userMapper.userTotal();
        List<UserOrderResponse> list = userMapper.lastOrder((page - 1) * pers, pers);
        Page<List<UserOrderResponse>> objectPage = new Page<>(total, list, page, pers);
        return CommonResult.ok(objectPage);
    }

}
