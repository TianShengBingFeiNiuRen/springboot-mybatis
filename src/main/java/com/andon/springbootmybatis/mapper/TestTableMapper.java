package com.andon.springbootmybatis.mapper;

import com.andon.springbootmybatis.domain.TestTable;

/**
 * @author Andon
 * 2021/11/17
 */
public interface TestTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestTable record);

    int insertSelective(TestTable record);

    TestTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestTable record);

    int updateByPrimaryKey(TestTable record);
}