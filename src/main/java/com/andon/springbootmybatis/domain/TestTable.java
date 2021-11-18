package com.andon.springbootmybatis.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Andon
 * 2021/11/17
 */
@ApiModel(value="测试表")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestTable implements Serializable {
    /**
    * ID
    */
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
    * key
    */
    @ApiModelProperty(value="key")
    private String key;

    /**
    * value
    */
    @ApiModelProperty(value="value")
    private String value;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private String updateTime;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private String createTime;

    private static final long serialVersionUID = 1L;
}