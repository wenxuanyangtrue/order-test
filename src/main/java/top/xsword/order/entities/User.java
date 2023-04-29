package top.xsword.order.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Author: ywx
 * Create Time: 2023/4/28
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String nickname;
    private String mobile;
    private String productName;
    private String totalPrice;
    private Integer count;
    private String unitPrice;
    private Integer status;
    private Integer payType;
}
