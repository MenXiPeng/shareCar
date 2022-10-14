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
public class WebsiteNotice {
    private Integer id;

    /**
    * 创建用户
    */
    private Integer creatorId;

    /**
    * 公告信息
    */
    private String info;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
    * 修改用户
    */
    private Integer editId;
}
