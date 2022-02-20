package com.rsosor.ec.service;

import com.rsosor.ec.dto.SmsFlashPromotionSessionDetail;
import com.rsosor.ec.model.SmsFlashPromotionSession;

import java.util.List;

/**
 * 限時購場次管理 Service
 *
 * @author RsosoR
 * @date 2022/2/21
 */
public interface SmsFlashPromotionSessionService {

    /**
     * 添加場次
     */
    int create(SmsFlashPromotionSession promotionSession);

    /**
     * 修改場次
     */
    int update(Long id, SmsFlashPromotionSession promotionSession);

    /**
     * 修改場次啟用狀態
     */
    int updateStatus(Long id, Integer status);

    /**
     * 刪除場次
     */
    int delete(Long id);

    /**
     * 獲取詳情
     */
    SmsFlashPromotionSession getItem(Long id);

    /**
     * 根據啟用狀態獲取場次列表
     */
    List<SmsFlashPromotionSession> list();

    /**
     * 獲取全部可選場次及其數量
     */
    List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId);
}
