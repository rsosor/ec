package com.rsosor.ec.dto;

import com.rsosor.ec.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * 品牌請求參數
 *
 * @author RsosoR
 * @date 2022/1/16
 */
@Data
@EqualsAndHashCode
public class PmsBrandParam {

    @NotEmpty
    @ApiModelProperty(value = "品牌名稱", required = true)
    private String name;

    @ApiModelProperty(value = "品牌首字母")
    private String firstLetter;

    @Min(value = 0)
    @ApiModelProperty(value = "排序字段")
    private Integer sort;

    @FlagValidator(value = {"0", "1"}, message = "廠家狀態不正確")
    @ApiModelProperty(value = "是否為廠家製造商")
    private Integer factoryStatus;

    @FlagValidator(value = {"0", "1"}, message = "顯示狀態不正確")
    @ApiModelProperty(value = "是否進行顯示")
    private Integer showStatus;

    @NotEmpty
    @ApiModelProperty(value = "品牌 logo", required = true)
    private String logo;

    @ApiModelProperty(value = "品牌大圖")
    private String bigPic;

    @ApiModelProperty(value = "品牌故事")
    private String brandStory;
}
