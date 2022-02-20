package com.rsosor.ec.dto;

import com.rsosor.ec.model.PmsProduct;
import com.rsosor.ec.model.SmsFlashPromotionProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 限時購商品訊息封裝
 *
 * @author RsosoR
 * @date 2022/2/21
 */
@Getter
@Setter
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {

    @ApiModelProperty("關聯商品")
    private PmsProduct product;
}
