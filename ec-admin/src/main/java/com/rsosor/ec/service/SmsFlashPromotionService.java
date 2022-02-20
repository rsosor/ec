package com.rsosor.ec.service;

import com.rsosor.ec.model.SmsFlashPromotion;

import java.util.List;

/**
 * 限時購活動管理 Service
 *
 * @author RsosoR
 * @date 2022/2/21
 */
public interface SmsFlashPromotionService {

    /**
     * 添加活動
     */
    int create(SmsFlashPromotion flashPromotion);

    /**
     * 編輯指定活動
     */
    int update(Long id, SmsFlashPromotion flashPromotion);

    /**
     * 刪除單個活動
     */
    int delete(Long id);

    /**
     * 修改上下線狀態
     */
    int updateStatus(Long id, Integer status);

    /**
     * 獲取活動詳情
     */
    SmsFlashPromotion getItem(Long id);

    /**
     * 分頁查詢活動
     */
    List<SmsFlashPromotion> list(String keyword, Integer pageSize, Integer pageNum);
}
