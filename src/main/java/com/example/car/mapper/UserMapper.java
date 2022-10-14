package com.example.car.mapper;

import com.example.car.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 描述：
 * @author menxipeng by 2022/10/14
 */
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
