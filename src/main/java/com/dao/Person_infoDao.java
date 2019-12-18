package com.dao;

import com.entity.Person_info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Person_infoDao extends tk.mybatis.mapper.common.Mapper<Person_info> {
    @Select("select e.*,d.area_name from person_info e,area_info d where e.person_area_id=d.area_id")
    List<Person_info> findAll();
    @Select("select * from person_info where person_id=#{person_id}")
    Person_info findById(Integer person_id);
}
