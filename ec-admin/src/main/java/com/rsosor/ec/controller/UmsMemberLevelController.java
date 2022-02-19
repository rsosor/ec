package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.model.UmsMemberLevel;
import com.rsosor.ec.service.UmsMemberLevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 會員等級管理 Controller
 *
 * @author RsosoR
 * @date 2022/2/19
 */
@RestController
@Api(tags = "UmsMemberLevelController", description = "會員等級管理")
@RequestMapping("/memberLevel")
public class UmsMemberLevelController {

    @Autowired
    private UmsMemberLevelService memberLevelService;

    @ApiOperation("查詢所有會員等級")
    @GetMapping(value = "/list")
    public CommonResult<List<UmsMemberLevel>> list(@RequestParam("defaultStatus") Integer defaultStatus) {
        List<UmsMemberLevel> memberLevelList = memberLevelService.list(defaultStatus);
        return CommonResult.success(memberLevelList);
    }
}
