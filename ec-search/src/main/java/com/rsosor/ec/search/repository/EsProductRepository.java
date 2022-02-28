package com.rsosor.ec.search.repository;

import com.rsosor.ec.search.domain.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 搜索商品 ES 操作類
 *
 * @author RsosoR
 * @date 2022/2/28
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {

    /**
     * 搜索查詢
     * @param name          商品名稱
     * @param subTitle      商品標題
     * @param keywords      商品關鍵字
     * @param page          分頁訊息
     * @return
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
}
