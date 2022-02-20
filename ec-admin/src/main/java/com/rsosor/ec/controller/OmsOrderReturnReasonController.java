package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.model.OmsOrderReturnReason;
import com.rsosor.ec.service.OmsOrderReturnReasonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PatchMapping(value = "/create")
    public CommonResult create(@RequestBody OmsOrderReturnReason returnReason) {

    }
}
