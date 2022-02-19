package com.rsosor.ec.dto;

import com.rsosor.ec.model.SmsCoupon;
import com.rsosor.ec.model.SmsCouponProductCategoryRelation;
import com.rsosor.ec.model.SmsCouponProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 優惠券訊息封裝，包括綁定商品和分類
 *
 * @author RsosoR
 * @date 2022/2/19
 */
public class SmsCouponParam extends SmsCoupon {

    @Getter
    @Setter
    @ApiModelProperty("優惠券綁定的商品")
    private List<SmsCouponProductRelation> productRelationList;

    @Getter
    @Setter
    @ApiModelProperty("優惠券綁定的商品分類")
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;
}
