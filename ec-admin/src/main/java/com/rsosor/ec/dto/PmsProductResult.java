package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 查詢單個商品修改後返回的結果
 *
 * @author RsosoR
 * @date 2022/2/9
 */
public class PmsProductResult {

    @Getter
    @Setter
    @ApiModelProperty("商品所選分類的父 id")
    private Long cateParentId;
}
