package com.example.car.mapper;

import com.example.car.model.CarInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 描述：
 * @author menxipeng by 2022/10/14
 */
@Mapper
public interface CarInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    CarInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);
}
