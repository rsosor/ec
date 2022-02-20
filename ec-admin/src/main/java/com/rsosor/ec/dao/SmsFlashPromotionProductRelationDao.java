package com.rsosor.ec.dao;

import com.rsosor.ec.dto.SmsFlashPromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 限時購和商品關聯管理自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/21
 */
public interface SmsFlashPromotionProductRelationDao {

    /**
     * 獲取限時購及相關商品訊息
     */
    List<SmsFlashPromotionProduct> getList(@Param("flashPromotionId") Long flashPromotionId, @Param("flashPromotionSessionId") Long flashPromotionSessionId);
}
