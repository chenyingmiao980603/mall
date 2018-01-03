package com.neusoft.mall.orders;


import com.neusoft.mall.common.base.BaseDTO;
import com.neusoft.mall.orders.domain.UserOrder;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * Created by chenyingmiao on 17/10/5.
 *
 * @author chenyingmiao
 */
@Data
public class UserOrderDTO extends BaseDTO{

    /**
     * 用户id
     */
    private String userId;

    /**
     * 地址id
     */
    private String addressId;

    /**
     * 订单总积分
     */
    private Integer totalIntegral;

    /**
     * 商品id
     */
    private String commodityId;

    /**
     * 商品数量
     */
    private Integer commodityCounts;

    public static UserOrder copy(UserOrderDTO dto){
        UserOrder userOrder = new UserOrder();
        BeanUtils.copyProperties(dto,userOrder);
        return userOrder;
    }
}
