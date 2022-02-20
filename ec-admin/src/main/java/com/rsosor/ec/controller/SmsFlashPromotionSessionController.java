package com.rsosor.ec.controller;

import com.rsosor.ec.common.api.CommonResult;
import com.rsosor.ec.dto.SmsFlashPromotionSessionDetail;
import com.rsosor.ec.model.SmsFlashPromotionSession;
import com.rsosor.ec.service.SmsFlashPromotionSessionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 限時購場次管理 Controller
 *
 * @author RsosoR
 * @date 2022/2/21
 */
@RestController
@Api(tags = "SmsFlashPromotionSessionController", description = "限時購場次管理")
public class SmsFlashPromotionSessionController {

    @Autowired
    private SmsFlashPromotionSessionService flashPromotionSessionService;

    @ApiOperation("添加場次")
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody SmsFlashPromotionSession promotionSession) {
        int count = flashPromotionSessionService.create(promotionSession);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改場次")
    @PostMapping(value = "/update/{id}")
    public CommonResult update(@PathVariable Long id, @RequestBody SmsFlashPromotionSession promotionSession) {
        int count = flashPromotionSessionService.update(id, promotionSession);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改啟用狀態")
    @PostMapping(value = "/update/status/{id}")
    public CommonResult update(@PathVariable Long id, Integer status) {
        int count = flashPromotionSessionService.updateStatus(id, status);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("刪除場次")
    @PostMapping(value = "/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        int count = flashPromotionSessionService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("獲取場次詳情")
    @GetMapping(value = "/{id}")
    public CommonResult<SmsFlashPromotionSession> getItem(@PathVariable Long id) {
        SmsFlashPromotionSession promotionSession = flashPromotionSessionService.getItem(id);
        return CommonResult.success(promotionSession);
    }

    @ApiOperation("獲取全部場次")
    @GetMapping(value = "/list")
    public CommonResult<List<SmsFlashPromotionSession>> list() {
        List<SmsFlashPromotionSession> promotionSessionList = flashPromotionSessionService.list();
        return CommonResult.success(promotionSessionList);
    }

    @ApiOperation("獲取全部可選場次及其數量")
    @GetMapping(value = "/selectList")
    public CommonResult<List<SmsFlashPromotionSessionDetail>> selectList(Long flashPromotionId) {
        List<SmsFlashPromotionSessionDetail> promotionSessionList = flashPromotionSessionService.selectList(flashPromotionId);
        return CommonResult.success(promotionSessionList);
    }
}
