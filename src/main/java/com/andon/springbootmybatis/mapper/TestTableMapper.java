package com.andon.springbootmybatis.mapper;

import com.andon.springbootmybatis.domain.TestTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    int insertTestTableBatch(List<TestTable> testTableList);

    List<TestTable> selectTestTableLimit(@Param("row") int row, @Param("size") int size);
}