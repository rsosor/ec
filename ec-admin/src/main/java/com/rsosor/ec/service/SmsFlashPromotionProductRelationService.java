package com.rsosor.ec.service;

import com.rsosor.ec.dto.SmsFlashPromotionProduct;
import com.rsosor.ec.model.SmsFlashPromotionProductRelation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 限時購和商品關聯管理 Service
 *
 * @author RsosoR
 * @date 2022/2/21
 */
public interface SmsFlashPromotionProductRelationService {

    /**
     * 批量添加關聯
     */
    @Transactional
    int create(List<SmsFlashPromotionProductRelation> relationList);

    /**
     * 修改關聯訊息
     */
    int update(Long id, SmsFlashPromotionProductRelation relation);

    /**
     * 刪除關聯
     */
    int delete(Long id);

    /**
     * 獲取關聯詳情
     */
    SmsFlashPromotionProductRelation getItem(Long id);

    /**
     * 分頁查詢相關商品及限時促銷訊息
     * @param flashPromotionId        限時購 id
     * @param flashPromotionSessionId 限時購場次 id
     */
    List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum);

    /**
     * 根據活動和場次id獲取商品關係數量
     * @param flashPromotionId        限時購 id
     * @param flashPromotionSessionId 限時購場次 id
     */
    long getCount(Long flashPromotionId, Long flashPromotionSessionId);
}
