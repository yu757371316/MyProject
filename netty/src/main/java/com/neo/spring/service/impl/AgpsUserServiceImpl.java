package com.neo.spring.service.impl;

import com.neo.spring.common.entity.AgpsUser;
import com.neo.spring.service.itf.AgpsUserServiceI;
import org.springframework.stereotype.Service;

/**
 * User: 20160301301
 * Date: 2018/1/3 9:10
 * Comment:
 */
@Service
public class AgpsUserServiceImpl implements AgpsUserServiceI {
    @Override
    public AgpsUser getAgpsUserById(String id) {
        AgpsUser agpsUser = new AgpsUser();
        agpsUser.setId(1);
        agpsUser.setName("test");
        return agpsUser;
    }
}
