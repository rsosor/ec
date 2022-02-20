package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonPage;
import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.model.OmsOrder;
import com.rsosor.ec.model.OmsOrderReturnReason;
import com.rsosor.ec.service.OmsOrderReturnReasonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 退貨原因管理 Controller
 *
 * @author RsosoR
 * @date 2022/2/20
 */
@RestController
@Api(tags = "OmsOrderReturnReasonController", description = "退貨原因管理")
@RequestMapping("/returnReason")
public class OmsOrderReturnReasonController {

    @Autowired
    private OmsOrderReturnReasonService orderReturnReasonService;

    @ApiOperation("添加退貨原因")
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody OmsOrderReturnReason returnReason) {
        int count = orderReturnReasonService.create(returnReason);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改退貨原因")
    @PostMapping(value = "/update/{id}")
    public CommonResult update(@PathVariable Long id, @RequestBody OmsOrderReturnReason returnReason) {
        int count = orderReturnReasonService.update(id, returnReason);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("批量刪除退貨原因")
    @PostMapping(value = "/delete")
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = orderReturnReasonService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("分頁查詢退貨原因")
    @GetMapping(value = "/list")
    public CommonResult<CommonPage<OmsOrderReturnReason>> list(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<OmsOrderReturnReason> reasonList = orderReturnReasonService.list(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(reasonList));
    }

    @ApiOperation("獲取單個退貨原因詳情訊息")
    @GetMapping(value = "/{id}")
    public CommonResult<OmsOrderReturnReason> getItem(@PathVariable Long id) {
        OmsOrderReturnReason reason = orderReturnReasonService.getItem(id);
        return CommonResult.success(reason);
    }

    @ApiOperation("修改退貨原因啟用狀態")
    @PostMapping(value = "/update/status")
    public CommonResult updateStatus(@RequestParam(value = "status") Integer status,
                                     @RequestParam(value = "ids") List<Long> ids) {
        int count = orderReturnReasonService.updateStatus(ids, status);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
