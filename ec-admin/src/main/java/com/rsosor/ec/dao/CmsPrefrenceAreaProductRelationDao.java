package com.rsosor.ec.dao;

import com.rsosor.ec.model.CmsPrefrenceAreaProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 優選和商品關係自定義 Dao
 *
 * @author RsosoR
 * @date 2022/1/25
 */
public interface CmsPrefrenceAreaProductRelationDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list") List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}
