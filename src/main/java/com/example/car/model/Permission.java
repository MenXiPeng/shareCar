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
public class Permission {
    /**
    * 主键
    */
    private Long id;

    /**
    * 菜单名称
    */
    private String menuName;

    /**
    * 权限路径
    */
    private String path;

    /**
    * 请求方式
    */
    private String method;

    /**
    * 父菜单
    */
    private Integer parentId;
}
