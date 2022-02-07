package com.rsosor.ec.service;

import com.rsosor.ec.dto.PmsProductAttributeParam;
import com.rsosor.ec.dto.ProductAttrInfo;
import com.rsosor.ec.model.PmsProductAttribute;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品屬性管理 Service
 *
 * @author RsosoR
 * @date 2022/2/7
 */
public interface PmsProductAttributeService {

    /**
     * 根據分類分頁獲取商品屬性
     *
     * @param cid 分類id
     * @param type 0->規格；1->參數
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 添加商品屬性
     *
     * @param pmsProductAttributeParam
     * @return
     */
    @Transactional
    int create(PmsProductAttributeParam pmsProductAttributeParam);

    /**
     * 修改商品屬性
     *
     * @param id
     * @param productAttributeParam
     * @return
     */
    int update(Long id, PmsProductAttributeParam productAttributeParam);

    /**
     * 獲取單個商品屬性訊息
     *
     * @param id
     * @return
     */
    PmsProductAttribute getItem(Long id);

    /**
     * 批量刪除商品屬性
     *
     * @param ids
     * @return
     */
    @Transactional
    int delete(List<Long> ids);

    /**
     * 獲取商品分類對應屬性列表
     *
     * @param productCategoryId
     * @return
     */
    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);
}
