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
public class RolePermission {
    private Integer id;

    /**
    * 角色id
    */
    private Integer roleId;

    /**
    * 权限id
    */
    private Integer permissionId;
}
