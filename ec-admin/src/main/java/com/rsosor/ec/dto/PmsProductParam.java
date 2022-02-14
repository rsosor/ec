package com.rsosor.ec.dto;

import com.rsosor.ec.model.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 創建和修改商品的請求參數
 *
 * @author RsosoR
 * @date 2022/2/9
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductParam extends PmsProduct {

    @ApiModelProperty("商品階梯價格設置")
    private List<PmsProductLadder> productLadderList;

    @ApiModelProperty("商品滿減價格設置")
    private List<PmsProductFullReduction> productFullReductionList;

    @ApiModelProperty("商品會員價格設置")
    private List<PmsMemberPrice> memberPriceList;

    @ApiModelProperty("商品的 sku 庫存訊息")
    private List<PmsSkuStock> skuStockList;

    @ApiModelProperty("商品參數及自定義規格屬性")
    private List<PmsProductAttributeValue> productAttributeValueList;

    @ApiModelProperty("專題和商品關係")
    private List<CmsSubjectProductRelation> subjectProductRelationList;

    @ApiModelProperty("優選專區和商品的關係")
    private List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;
}
