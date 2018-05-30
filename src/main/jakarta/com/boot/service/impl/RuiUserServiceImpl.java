package com.boot.service.impl;

import com.boot.base.enums.ResponseEnum;
import com.boot.base.response.Response;
import com.boot.base.utils.BeanCopyUtil;
import com.boot.model.bo.RuiUserBO;
import com.boot.mapper.RuiUserMapper;
import com.boot.model.po.RuiUserPO;
import com.boot.service.RuiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

/**
 * @author CHENGRui
 * @Since 2018/5/30
 */
//@Service("ruiUserService")
//@EnableAutoConfiguration
//@Repository
@Component
public class RuiUserServiceImpl implements RuiUserService {

    @Autowired
    private RuiUserMapper ruiUserMapper;

    @Override
    public Response<RuiUserBO> getRuiUserById(int id) {
        if (id <= 0) {
            return Response.fail(ResponseEnum.PARAMETER_ERROR.getName());
        }
        RuiUserBO bo;
        try {
            RuiUserPO po = ruiUserMapper.selectById(id);
            bo = BeanCopyUtil.copy(po, RuiUserBO.class);
        } catch (Exception e) {
            System.out.println(e);
            return Response.fail(e.getMessage());
        }
        return Response.success(bo);
    }
}
