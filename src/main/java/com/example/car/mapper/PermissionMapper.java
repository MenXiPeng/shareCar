package com.example.car.mapper;

import com.example.car.model.Permission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 描述：
 * @author menxipeng by 2022/10/14
 */
@Mapper
public interface PermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}
