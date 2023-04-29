package top.xsword.order.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.xsword.order.controller.OrderController;

import java.util.Date;
import java.util.Objects;

/**
 * Author: ywx
 * Create Time: 2023/4/28
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOrderResponse {
    private String id;
    private String nickname;
    private String mobile;
    private String productName;
    private String totalPrice;
    private Integer count;
    private String unitPrice;
    private Integer status;
    private Integer payType;
    private Date createdAt;
    private Date updatedAt;
}
