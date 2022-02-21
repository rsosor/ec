package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonPage;
import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.model.SmsHomeNewProduct;
import com.rsosor.ec.service.SmsHomeNewProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 首頁新品管理 Controller
 *
 * @author RsosoR
 * @date 2022/2/21
 */
@RestController
@Api(tags = "SmsHomeNewProductController", description = "首頁新品管理")
@RequestMapping("/home/newProduct")
public class SmsHomeNewProductController {

    @Autowired
    private SmsHomeNewProductService homeNewProductService;

    @ApiOperation("添加首頁新品")
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody List<SmsHomeNewProduct> homeNewProductList) {
        int count = homeNewProductService.create(homeNewProductList);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改首頁新品排序")
    @PostMapping(value = "/update/sort/{id}")
    public CommonResult updateSort(@PathVariable Long id, Integer sort) {
        int count = homeNewProductService.updateSort(id, sort);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("批量刪除首頁新品")
    @PostMapping(value = "/delete")
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = homeNewProductService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("批量修改首頁新品狀態")
    @PostMapping(value = "/update/recommendStatus")
    public CommonResult list(@RequestParam("ids") List<Long> ids, @RequestParam Integer recommendStatus) {
        int count = homeNewProductService.updateRecommendStatus(ids, recommendStatus);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("分頁查詢首頁新品")
    @GetMapping(value = "/list")
    public CommonResult<CommonPage<SmsHomeNewProduct>> list(@RequestParam(value = "productName", required = false) String productName,
                                                            @RequestParam(value = "recommendStatus", required = false) Integer recommendStatus,
                                                            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsHomeNewProduct> homeNewProductList = homeNewProductService.list(productName, recommendStatus, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(homeNewProductList));
    }
}
