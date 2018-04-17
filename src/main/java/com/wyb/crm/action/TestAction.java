package com.wyb.crm.action;

import com.alibaba.fastjson.JSON;
import com.wyb.crm.entity.student;
import com.wyb.crm.service.interfaces.StudentSV;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/28.
 */
@RestController
@RequestMapping("/test")
public class TestAction {

    @Resource
    private StudentSV studentSV;

    @RequestMapping("/doTest.do")
    public Map<String,Object> test(){
        Map resultMap = new HashMap();

        try {
            System.out.print("注解成功");
            student s = studentSV.selectAll();
            resultMap.put("flag","Y");
            resultMap.put("data", JSON.toJSONString(s));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultMap;
    }


}
