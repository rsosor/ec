package com.rsosor.ec.dto;

import com.rsosor.ec.model.OmsCompanyAddress;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 申請訊息封裝
 *
 * @author RsosoR
 * @date 2022/2/20
 */
@Getter
@Setter
public class OmsOrderReturnApplyResult {

    @ApiModelProperty(value = "公司收貨地址")
    private OmsCompanyAddress companyAddress;
}
