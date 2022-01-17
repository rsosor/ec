package com.rsosor.ec.dto;

import com.rsosor.ec.model.PmsProductAttribute;
import com.rsosor.ec.model.PmsProductAttributeCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 帶有屬性的商品屬性分類
 *
 * @author RsosoR
 * @date 2022/1/17
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {

    @Getter
    @Setter
    @ApiModelProperty(value = "商品屬性列表")
    private List<PmsProductAttribute> productAttributeList;
}
