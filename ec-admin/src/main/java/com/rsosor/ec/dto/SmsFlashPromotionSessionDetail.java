package com.rsosor.ec.dto;

import com.rsosor.ec.model.SmsFlashPromotionSession;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 包含商品數量的場次訊息
 *
 * @author RsosoR
 * @date 2022/2/21
 */
@Getter
@Setter
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {

    @ApiModelProperty("商品數量")
    private Long productCount;
}
