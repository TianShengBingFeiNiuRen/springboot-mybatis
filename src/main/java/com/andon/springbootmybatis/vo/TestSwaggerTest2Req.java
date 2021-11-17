package com.andon.springbootmybatis.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Andon
 * 2021/11/10
 * <p>
 * test2
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestSwaggerTest2Req implements Serializable {

    @ApiModelProperty(value = "参数1", required = true)
    private String param1;
    @ApiModelProperty(value = "参数2", required = true)
    private String param2;
}
