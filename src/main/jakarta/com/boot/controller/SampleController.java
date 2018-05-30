package com.boot.controller;

import com.alibaba.fastjson.JSON;
import com.boot.mapper.RuiUserMapper;
import com.boot.model.po.RuiUserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Song on 2017/2/15.
 * 官方示例工程中的测试代码
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

//    @Autowired
//    private RuiUserService ruiUserService;

    @Autowired
    private RuiUserMapper ruiUserMapper;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        String firstUser = "";
//        Response<RuiUserBO> response = ruiUserService.getRuiUserById(1);
        RuiUserPO po = ruiUserMapper.selectById(1);
//        if (response.isSuccess()) {
//            firstUser = JSON.toJSONString(response);
//        } else {
//            firstUser = response.getMsg();
//        }
        return "Hello World!" + JSON.toJSONString(po);
    }


}