package com.funtl.hello.apache.shardingsphere.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.hello.apache.shardingsphere.mapper.TbOrderMapper;
import com.funtl.hello.apache.shardingsphere.service.api.TbOrderService;
@Service
public class TbOrderServiceImpl implements TbOrderService{

    @Resource
    private TbOrderMapper tbOrderMapper;

}
