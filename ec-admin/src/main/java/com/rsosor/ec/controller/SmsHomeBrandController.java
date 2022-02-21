package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonPage;
import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.model.SmsHomeBrand;
import com.rsosor.ec.service.SmsHomeBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 首頁品牌管理 Controller
 *
 * @author RsosoR
 * @date 2022/2/21
 */
@RestController
@Api(tags = "SmsHomeBrandController", description = "首頁品牌管理")
@RequestMapping("/home/brand")
public class SmsHomeBrandController {

    @Autowired
    private SmsHomeBrandService homeBrandService;

    @ApiOperation("添加首頁推薦品牌")
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody List<SmsHomeBrand> homeBrandList) {
        int count = homeBrandService.create(homeBrandList);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改推薦品牌排序")
    @PostMapping(value = "/update/sort/{id}")
    public CommonResult updateSort(@PathVariable Long id, Integer sort) {
        int count = homeBrandService.updateSort(id, sort);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("批量刪除推薦品牌")
    @PostMapping(value = "/delete")
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = homeBrandService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("批量修改推薦品牌狀態")
    @PostMapping(value = "/update/recommendStatus")
    public CommonResult updateRecommendStatus(@RequestParam("ids") List<Long> ids, @RequestParam Integer recommendStatus) {
        int count = homeBrandService.updateRecommendStatus(ids, recommendStatus);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("分頁查詢推薦品牌")
    @GetMapping(value = "/list")
    public CommonResult<CommonPage<SmsHomeBrand>> list(@RequestParam(value = "brandName", required = false) String brandName,
                                                       @RequestParam(value = "recommendStatus", required = false) Integer recommendStatus,
                                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsHomeBrand> homeBrandList = homeBrandService.list(brandName, recommendStatus, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(homeBrandList));
    }
}
