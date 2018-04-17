package com.wyb.crm.service.impl;

import com.wyb.crm.dao.studentMapper;
import com.wyb.crm.entity.student;
import com.wyb.crm.service.interfaces.StudentSV;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/11/28.
 */
@Service
public class StudentSVImpl implements StudentSV {
    @Resource
    private studentMapper student;
    @Override
    public student selectAll() throws Exception {
        return student.selectByPrimaryKey(1);
    }
}
