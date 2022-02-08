package com.rsosor.ec.dto;

import com.rsosor.ec.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 添加更新產品分類的參數
 *
 * @author RsosoR
 * @date 2022/2/8
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductCategoryParam {

    @ApiModelProperty("父分類的編號")
    private Long parentId;

    @NotEmpty
    @ApiModelProperty(value = "商品分類名稱", required = true)
    private String name;

    @ApiModelProperty("分類單位")
    private String productUnit;

    @FlagValidator(value = {"0", "1"}, message = "狀態只能為0或1")
    @ApiModelProperty("是否在導航欄顯示")
    private Integer navStatus;

    @FlagValidator(value = {"0", "1"}, message = "狀態只能為0或1")
    @ApiModelProperty("是否進行顯示")
    private Integer showStatus;

    @Min(value = 0)
    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("圖標")
    private String icon;

    @ApiModelProperty("關鍵字")
    private String keywords;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("產品相關篩選屬性集合")
    private List<Long> productAttributeIdList;
}
