package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonPage;
import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.model.SmsHomeAdvertise;
import com.rsosor.ec.service.SmeHomeAdvertiseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 首頁輪播廣告管理 Controller
 *
 * @author RsosoR
 * @date 2022/2/21
 */
@RestController
@Api(tags = "SmsHomeAdvertiseController", description = "首頁輪播廣告管理")
@RequestMapping("/home/advertise")
public class SmsHomeAdvertiseController {

    @Autowired
    private SmeHomeAdvertiseService advertiseService;

    @ApiOperation("添加廣告")
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody SmsHomeAdvertise advertise) {
        int count = advertiseService.create(advertise);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("刪除廣告")
    @PostMapping(value = "/delete")
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = advertiseService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改上下線狀態")
    @PostMapping(value = "/update/status/{id}")
    public CommonResult updateStatus(@PathVariable Long id, Integer status) {
        int count = advertiseService.updateStatus(id, status);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("獲取廣告詳情")
    @GetMapping(value = "/{id}")
    public CommonResult<SmsHomeAdvertise> getItem(@PathVariable Long id) {
        SmsHomeAdvertise advertise = advertiseService.getItem(id);
        return CommonResult.success(advertise);
    }

    @ApiOperation("修改廣告")
    @PostMapping(value = "/update/{id}")
    public CommonResult update(@PathVariable Long id, @RequestBody SmsHomeAdvertise advertise) {
        int count = advertiseService.update(id, advertise);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("分頁查詢廣告")
    @PostMapping(value = "/list")
    public CommonResult<CommonPage<SmsHomeAdvertise>> list(@RequestParam(value = "name", required = false) String name,
                                                           @RequestParam(value = "type", required = false) Integer type,
                                                           @RequestParam(value = "endTime", required = false) String endTime,
                                                           @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsHomeAdvertise> advertiseList = advertiseService.list(name, type, endTime, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(advertiseList));
    }
}
