package com.rsosor.ec.service;

import com.rsosor.ec.model.SmsHomeBrand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 首頁品牌管理 Service
 *
 * @author RsosoR
 * @date 2022/2/21
 */
public interface SmsHomeBrandService {

    /**
     * 添加首頁品牌推薦
     */
    @Transactional
    int create(List<SmsHomeBrand> homeBrandList);

    /**
     * 修改品牌推薦排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量刪除品牌推薦
     */
    int delete(List<Long> ids);

    /**
     * 批量更新推薦狀態
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分頁查詢品牌推薦
     */
    List<SmsHomeBrand> list(String brandName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
