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
import java.util.ArrayList;
import java.util.List;

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
    public void test06() {
//        Integer id = 2;
        Integer id = null;
        String key = "l";
//        String key = null;
        List<TestTable> list = testTableMapper.selectTestTableSelective(id, key, 0, 5);
        log.info("list.size={} list:{}", list.size(), JSONObject.toJSONString(list));
    }

    @Test
    public void test05() {
        String key = "l";
        List<TestTable> list = testTableMapper.selectTestTableLikeKey(key, 0, 5);
        log.info("list.size={} list:{}", list.size(), JSONObject.toJSONString(list));
    }

    @Test
    public void test04() {
        List<TestTable> list = testTableMapper.selectTestTable(0, 5);
        log.info("list:{}", JSONObject.toJSONString(list));
    }

    @Test
    public void test03() {
        List<TestTable> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            TestTable testTable = TestTable.builder().key(String.valueOf(i)).value(String.valueOf(i)).build();
            list.add(testTable);
        }
        int row = testTableMapper.insertTestTableBatch(list);
        log.info("row:{}", row);
    }

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
