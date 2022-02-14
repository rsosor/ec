package com.rsosor.ec.dao;

import com.rsosor.ec.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品和專題關係自定義 Dao
 *
 * @author RsosoR
 * @date 2022/2/9
 */
public interface CmsSubjectProductRelationDao {

    /**
     * 批量創建
     */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectPRoductRelationList);
}
