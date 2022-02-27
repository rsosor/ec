package com.rsosor.ec.demo.dto;

import com.rsosor.ec.demo.validator.FlagValidator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 品牌傳遞參數
 *
 * @author RsosoR
 * @date 2022/2/26
 */
@ApiModel(value = "PmsBrandDto")
public class PmsBrandDto {

    @ApiModelProperty(value = "品牌名稱", required = true)
    @NotNull(message = "名稱不能為空")
    private String name;

    @ApiModelProperty(value = "品牌首字母", required = true)
    @NotNull(message = "首字母不能為空")
    private String firstLetter;

    @ApiModelProperty(value = "排序字段")
    @Min(value = 0, message = "排序最小為0")
    private Integer sort;

    @ApiModelProperty(value = "是否為廠家製造商")
    @FlagValidator(value = {"0", "1"}, message = "廠家狀態不正確")
    private Integer factoryStatus;

    @ApiModelProperty(value = "是否進行顯示")
    @FlagValidator(value = {"0", "1"}, message = "顯示狀態不正確")
    private Integer showStatus;

    @ApiModelProperty(value = "品牌 logo")
    private String logo;

    @ApiModelProperty(value = "品牌大圖")
    private String bigPic;

    @ApiModelProperty(value = "品牌故事")
    private String brandStory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }
}
