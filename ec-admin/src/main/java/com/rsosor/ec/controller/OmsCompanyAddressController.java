package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.model.OmsCompanyAddress;
import com.rsosor.ec.service.OmsCompanyAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 收貨地址管理 Controller
 *
 * @author RsosoR
 * @date 2022/2/19
 */
@RestController
@Api(tags = "OmsCompanyAddressController", description = "收貨地址管理")
@RequestMapping("/companyAddress")
public class OmsCompanyAddressController {

    @Autowired
    private OmsCompanyAddressService companyAddressService;

    @ApiOperation("獲取所有收貨地址")
    @GetMapping(value = "/list")
    public CommonResult<List<OmsCompanyAddress>> list() {
        List<OmsCompanyAddress> companyAddressList = companyAddressService.list();
        return CommonResult.success(companyAddressList);
    }
}
