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
public class BackgroundUser {
    /**
    * 主键
    */
    private Long id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 名称
    */
    private String name;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 地址
    */
    private String address;

    /**
    * 邮箱
    */
    private String email;
}
