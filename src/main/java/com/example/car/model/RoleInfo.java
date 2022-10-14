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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleInfo {
    /**
    * id
    */
    private Long id;

    /**
    * 角色名称
    */
    private String roleName;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 修改时间
    */
    private LocalDateTime updateTime;
}
