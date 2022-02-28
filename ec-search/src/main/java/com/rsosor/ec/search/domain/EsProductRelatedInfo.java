package com.rsosor.ec.search.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 搜索商品的關聯訊息，包括品牌名稱、分類名稱及屬性
 *
 * @author RsosoR
 * @date 2022/2/28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EsProductRelatedInfo {

    private List<String> brandNames;
    private List<String> productCategoryNames;
    private List<ProductAttr> productAttrs;

    @Data
    @EqualsAndHashCode(callSuper = false)
    public static class ProductAttr {
        private Long attrId;
        private String attrName;
        private List<String> attrValues;
    }
}
