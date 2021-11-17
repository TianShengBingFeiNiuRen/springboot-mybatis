package com.andon.springbootmybatis;

import com.alibaba.fastjson.JSONObject;
import com.andon.springbootmybatis.domain.TestTable;
import com.andon.springbootmybatis.mapper.TestTableMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Andon
 * 2021/11/17
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseTest {

    @Resource
    private TestTableMapper testTableMapper;

    @Test
    public void test02() {
        TestTable testTable = testTableMapper.selectByPrimaryKey(1);
        log.info("testTable:{}", JSONObject.toJSONString(testTable));
    }

    @Test
    public void test01() {
        TestTable testTable = TestTable.builder().key("hello").value("world").build();
        int row = testTableMapper.insertSelective(testTable);
        log.info("row:{}", row);
    }
}
