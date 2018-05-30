package com.boot.service;

import com.boot.base.response.Response;
import com.boot.model.bo.RuiUserBO;

/**
 * Service
 *
 * @author laotree
 * @Date 2018/5/30 下午4:33:28
 */

public interface RuiUserService {

    Response<RuiUserBO> getRuiUserById(int id);

}
