package com.lcc.store.mapper;


import com.lcc.store.entity.Order;
import com.lcc.store.entity.OrderItem;
import org.springframework.stereotype.Repository;

/** 处理订单及订单商品数据的持久层接口 */
@Repository
public interface OrderMapper {
    /**
     * 插入订单数据
     * @param order 订单数据
     * @return 受影响的行数
     */
    Integer insertOrder(Order order);

    /**
     * 插入订单商品数据
     * @param orderItem 订单商品数据
     * @return 受影响的行数
     */
    Integer insertOrderItem(OrderItem orderItem);
}
