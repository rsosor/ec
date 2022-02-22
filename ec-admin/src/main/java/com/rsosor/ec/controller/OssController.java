package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.dto.OssCallbackResult;
import com.rsosor.ec.dto.OssPolicyResult;
import com.rsosor.ec.service.OssService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Oss 對象儲存管理 Controller
 * 
 * @author RsosoR
 * @date 2022/1/16
 */
public class OssController {

    @Autowired
    private OssService ossService;

    @ApiOperation("Oss 上傳簽名生成")
    @GetMapping(value = "/policy")
    public CommonResult<OssPolicyResult> policy() {
        OssPolicyResult result = ossService.policy();
        return CommonResult.success(result);
    }

    @ApiOperation("Oss 上傳成功回調")
    @PostMapping(value = "callback")
    public CommonResult<OssCallbackResult> callback(HttpServletRequest request) {
        OssCallbackResult ossCallbackResult = ossService.callback(request);
        return CommonResult.success(ossCallbackResult);
    }
}
