package com.example.car.mapper;

import com.example.car.model.BackgroundUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 描述：
 * @author menxipeng by 2022/10/14
 */
@Mapper
public interface BackgroundUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BackgroundUser record);

    int insertSelective(BackgroundUser record);

    BackgroundUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BackgroundUser record);

    int updateByPrimaryKey(BackgroundUser record);
}
