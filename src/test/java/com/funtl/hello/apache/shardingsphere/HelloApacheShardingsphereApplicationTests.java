package com.funtl.hello.apache.shardingsphere;

import com.funtl.hello.apache.shardingsphere.domain.TbOrder;
import com.funtl.hello.apache.shardingsphere.mapper.TbOrderItemMapper;
import com.funtl.hello.apache.shardingsphere.mapper.TbOrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class HelloApacheShardingsphereApplicationTests {

    @Resource
    TbOrderMapper tbOrderMapper;

    @Resource
    TbOrderItemMapper tbOrderItemMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testInsertOrder(){
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(1L);
        tbOrder.setUserId(2L);
        tbOrderMapper.insert(tbOrder);
    }

    @Test
    public void testSelectAll(){
        List<TbOrder> tbOrders = tbOrderMapper.selectAll();
        tbOrders.forEach(tbOrder -> System.out.println(tbOrder));
    }

}
