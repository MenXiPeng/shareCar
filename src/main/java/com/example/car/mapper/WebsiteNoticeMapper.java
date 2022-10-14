package com.example.car.mapper;

import com.example.car.model.WebsiteNotice;
import org.apache.ibatis.annotations.Mapper;

/**
 * 描述：
 * @author menxipeng by 2022/10/14
 */
@Mapper
public interface WebsiteNoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WebsiteNotice record);

    int insertSelective(WebsiteNotice record);

    WebsiteNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebsiteNotice record);

    int updateByPrimaryKey(WebsiteNotice record);
}
