package com.leishaw.forjob.service.impl;

import com.leishaw.forjob.DAO.FuckDOMapper;
import com.leishaw.forjob.DO.FuckDO;
import com.leishaw.forjob.service.FuckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by leishaw on 27/06/2017.
 */
@Service("userService")
class FuckServiceImpl implements FuckService{

    @Resource
    private FuckDOMapper fuckDOMapper;

    public FuckDO getFuckById(int id) {
        System.out.println("mapper"+fuckDOMapper);
        FuckDO fuckDO = fuckDOMapper.selectByPrimaryKey(id);
        return fuckDO;
    }
}
