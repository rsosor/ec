package com.rsosor.ec.dto;

import com.rsosor.ec.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * 商品屬性參數
 *
 * @author RsosoR
 * @date 2022/2/7
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductAttributeParam {

    @NotEmpty
    @ApiModelProperty("屬性分類ID")
    private Long productAttributeCategoryId;

    @NotEmpty
    @ApiModelProperty("屬性名稱")
    private String name;

    @FlagValidator({"0", "1", "2"})
    @ApiModelProperty("屬性選擇類型：0->唯一；1->單選；2->多選")
    private Integer selectType;

    @FlagValidator({"0", "1"})
    @ApiModelProperty("屬性登錄方式：0->手工登錄；1->從列表中選取")
    private Integer inputType;

    @ApiModelProperty("可選值列表，以逗號隔開")
    private String inputList;

    private Integer sort;

    @ApiModelProperty("分類篩選樣式：0->普通；1->顏色")
    @FlagValidator({"0", "1"})
    private Integer filterType;

    @ApiModelProperty("檢索類型：0->不需要進行檢索；1->關鍵字檢索；2->範圍檢索")
    @FlagValidator({"0", "1", "2"})
    private Integer searchType;

    @ApiModelProperty("相同屬性產品是否關聯：0->不關聯；1->關聯")
    @FlagValidator({"0", "1"})
    private Integer relatedStatus;

    @ApiModelProperty("是否支持手動新增：0->不支持；1->支持")
    @FlagValidator({"0", "1"})
    private Integer handAddStatus;

    @ApiModelProperty("屬性的類型：0->規格；1->參數")
    @FlagValidator({"0", "1"})
    private Integer type;
}
