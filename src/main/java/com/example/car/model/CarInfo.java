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
    * 价格
车辆名称
车牌号
座位数
车辆年限
车辆品牌


    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarInfo {
    private Long id;

    /**
    * 业务id
    */
    private Long carId;

    /**
    * 车辆名称
    */
    private String name;

    /**
    * 车牌号
    */
    private String carNum;

    /**
    * 座位
    */
    private Integer seatNum;

    /**
    * 品牌
    */
    private String brand;

    /**
    * 价格
    */
    private Long prices;

    /**
    * 图片
    */
    private String img;

    /**
    * 地址
    */
    private String address;

    /**
    * 出租状态
    */
    private Integer status;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;
}
