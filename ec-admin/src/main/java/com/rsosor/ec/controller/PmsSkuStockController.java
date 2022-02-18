package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.model.PmsSkuStock;
import com.rsosor.ec.service.PmsSkuStockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品 SKU 庫存管理 Controller
 *
 * @author RsosoR
 * @date 2022/2/14
 */
@RestController
@Api(tags = "PmsSkuStockController", description = "sku 商品庫存管理")
@RequestMapping(value = "/sku")
public class PmsSkuStockController {

    @Autowired
    private PmsSkuStockService skuStockService;

    @ApiOperation("根據商品 ID 及 sku 編碼模糊搜索 sku 庫存")
    @GetMapping(value = "/{pid}")
    public CommonResult<List<PmsSkuStock>> getList(@PathVariable Long pid, @RequestParam(value = "keyword", required = false) String keyword) {
        List<PmsSkuStock> skuStockList = skuStockService.getList(pid, keyword);
        return CommonResult.success(skuStockList);
    }

    @ApiOperation("批量更新 sku 庫存訊息")
    @PostMapping(value = "/update/{pid}")
    public CommonResult update(@PathVariable Long pid, @RequestBody List<PmsSkuStock> skuStockList) {
        int count = skuStockService.update(pid, skuStockList);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
