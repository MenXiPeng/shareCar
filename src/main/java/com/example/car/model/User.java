package com.example.car.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 描述：
 * @author menxipeng by 2022/10/14
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
    * 自增主键
    */
    private Long id;

    private Long userId;

    /**
    * 姓名
    */
    private String name;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 年龄
    */
    private Integer age;

    /**
    * 性别 1：男 2 女
    */
    private Integer sex;

    /**
    * 地址
    */
    private String address;

    /**
    * 担保信息
    */
    private String guaranteeInfo;

    /**
    * 驾照
    */
    private String carNo;
}
