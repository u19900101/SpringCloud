package ppppp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import ppppp.entities.Order;

/**
 * @author pppppp
 * @date 2021/7/18 16:56
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    @Update("update t_order set status = 1 where user_id=#{userId} and status = #{status};")
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}