package com.rsosor.ec.dto;

import com.rsosor.ec.model.PmsProductCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 包含子級分類的商品分類
 *
 * @author RsosoR
 * @date 2022/2/8
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {

    @Getter
    @Setter
    @ApiModelProperty("子級分類")
    private List<PmsProductCategory> children;
}
