package com.example.car.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 描述：
 * @author menxipeng by 2022/10/14
 */

/**
    * 主键
订单编号
姓名
性别
驾驶证信息
车辆信息
取车时间
还车时间
车辆状态
订单状态
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;

    /**
    * 订单编号
    */
    private Long orderId;

    /**
    * 用户编号
    */
    private Long userId;

    /**
    * 客户姓名
    */
    private String username;

    /**
    * 车辆
    */
    private String carId;

    /**
    * 单价
    */
    private Long prices;

    /**
    * 总价格
    */
    private String totalPrices;

    /**
    * 下单时间
    */
    private LocalDateTime orderTime;

    /**
    * 归还时间
    */
    private LocalDateTime returnTime;

    /**
    * 订单状态
    */
    private Integer status;
}
