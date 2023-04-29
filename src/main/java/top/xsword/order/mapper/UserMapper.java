package top.xsword.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.xsword.order.entities.UserOrderResponse;

import java.util.List;

/**
 * Author: ywx
 * Create Time: 2023/4/28
 * Description:
 */
@Mapper
public interface UserMapper {

    Integer userTotal();

    List<UserOrderResponse> lastOrder(@Param("page") Integer page, @Param("pers") Integer pers);

}
