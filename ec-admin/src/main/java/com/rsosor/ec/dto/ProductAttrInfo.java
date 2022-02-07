package com.rsosor.ec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品分類對應屬性訊息
 *
 * @author RsosoR
 * @date 2022/2/7
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProductAttrInfo {

    @ApiModelProperty("商品屬性ID")
    private Long attributeId;

    @ApiModelProperty("商品屬性分類ID")
    private Long attributeCategoryId;
}
