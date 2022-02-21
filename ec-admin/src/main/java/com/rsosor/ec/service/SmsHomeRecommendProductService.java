package com.rsosor.ec.service;

import com.rsosor.ec.model.SmsHomeRecommendProduct;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 首頁人氣推薦管理 Service
 *
 * @author RsosoR
 * @date 2022/2/21
 */
public interface SmsHomeRecommendProductService {

    /**
     * 添加首頁推薦
     */
    @Transactional
    int create(List<SmsHomeRecommendProduct> homeRecommendProductList);

    /**
     * 修改推薦排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量刪除推薦
     */
    int delete(List<Long> ids);

    /**
     * 批量更新推薦狀態
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分頁查詢推薦
     */
    List<SmsHomeRecommendProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
