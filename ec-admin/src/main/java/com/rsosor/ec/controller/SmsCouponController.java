package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonPage;
import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.dto.SmsCouponParam;
import com.rsosor.ec.model.SmsCoupon;
import com.rsosor.ec.service.SmsCouponService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 優惠券管理 Controller
 *
 * @author RsosoR
 * @date 2022/2/19
 */
@RestController
@Api(tags = "SmsCouponController", description = "優惠券管理")
@RequestMapping("/coupon")
public class SmsCouponController {

    @Autowired
    private SmsCouponService couponService;

    @ApiOperation("添加優惠券")
    @PostMapping(value = "/create")
    public CommonResult add(@RequestBody SmsCouponParam couponParam) {
        int count = couponService.create(couponParam);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("刪除優惠券")
    @PostMapping(value = "/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        int count = couponService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改優惠券")
    @PostMapping(value = "/update/{id}")
    public CommonResult update(@PathVariable Long id, @RequestBody SmsCouponParam couponParam) {
        int count = couponService.update(id, couponParam);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("根據優惠券名稱和類型分頁獲取優惠券列表")
    @GetMapping(value = "/list")
    public CommonResult<CommonPage<SmsCoupon>> list(@RequestParam(value = "name", required = false) String name,
                                                    @RequestParam(value = "type", required = false) Integer type,
                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsCoupon> couponList = couponService.list(name, type, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(couponList));
    }

    @ApiOperation("獲取單個優惠券的詳細訊息")
    @GetMapping(value = "/{id}")
    public CommonResult<SmsCouponParam> getItem(@PathVariable Long id) {
        SmsCouponParam couponParam = couponService.getItem(id);
        return CommonResult.success(couponParam);
    }
}
