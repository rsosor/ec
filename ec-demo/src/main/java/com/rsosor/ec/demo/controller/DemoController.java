package com.rsosor.ec.demo.controller;

import com.rsosor.ec.common.api.CommonPage;
import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.demo.dto.PmsBrandDto;
import com.rsosor.ec.demo.service.DemoService;
import com.rsosor.ec.model.PmsBrand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 品牌管理示例 Controller
 * 
 * @author RsosoR
 * @date 2022/2/26
 */
@RestController
@Api(tags = "DemoController", description = "品牌管理示例")
public class DemoController {
    
    @Autowired
    private DemoService demoService;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);
    
    @ApiOperation("獲取全部品牌列表")
    @GetMapping(value = "/brand/listAll")
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(demoService.listAllBrand());
    }
    
    @ApiOperation("添加品牌")
    @PostMapping(value = "/brand/create")
    public CommonResult createBrand(@Validated @RequestBody PmsBrandDto pmsBrandDto) {
        CommonResult commonResult;
        int count = demoService.createBrand(pmsBrandDto);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrandDto);
            LOGGER.debug("createBrand success:{}", pmsBrandDto);
        } else {
            commonResult = CommonResult.failed("操作失敗");
            LOGGER.debug("createBrand failed:{}", pmsBrandDto);
        }
        return commonResult;
    }
    
    @ApiOperation("更新品牌")
    @PostMapping(value = "/brand/update/{id}")
    public CommonResult updateBrand(@PathVariable("id") Long id, @Validated @RequestBody PmsBrandDto pmsBrandDto) {
        CommonResult commonResult;
        int count = demoService.updateBrand(id, pmsBrandDto);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrandDto);
            LOGGER.debug("updateBrand success:{}", pmsBrandDto);
        } else {
            commonResult = CommonResult.failed("操作失敗");
            LOGGER.debug("updateBrand failed:{}", pmsBrandDto);
        }
        return commonResult;
    }

    @ApiOperation("刪除品牌")
    @GetMapping(value = "/brand/delete/{id}")
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        int count = demoService.deleteBrand(id);
        if (count == 1) {
            LOGGER.debug("deleteBrand success: id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteBrand failed: id={}", id);
            return CommonResult.failed("操作失敗");
        }
    }

    @ApiOperation("分頁獲取品牌列表")
    @GetMapping(value = "/brand/list")
    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<PmsBrand> brandList = demoService.listBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @ApiOperation("根據編號查詢品牌訊息")
    @GetMapping(value = "/brand/{id}")
    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
        return CommonResult.success(demoService.getBrand(id));
    }
}
