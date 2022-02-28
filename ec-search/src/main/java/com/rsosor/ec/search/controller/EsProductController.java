package com.rsosor.ec.search.controller;

import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.search.service.EsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 搜索商品管理 Controller
 *
 * @author RsosoR
 * @date 2022/2/28
 */
@RestController
@Api(tags = "EsProductController", description = "搜索商品管理")
@RequestMapping("/esProduct")
public class EsProductController {

    @Autowired
    private EsProductService esProductService;

    @ApiOperation("導入所有數據庫中商品到 ES")
    @PostMapping(value = "/importAll")
    public CommonResult<Integer> importAllList() {
        int count = esProductService.importAll();
        return CommonResult.success(count);
    }


}
