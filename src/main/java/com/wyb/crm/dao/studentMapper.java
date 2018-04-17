package com.wyb.crm.dao;

import com.wyb.crm.entity.student;

public interface studentMapper {
    int deleteByPrimaryKey(Integer isid);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer isid);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}