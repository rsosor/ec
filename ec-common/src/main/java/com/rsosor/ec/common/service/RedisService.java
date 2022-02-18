package com.rsosor.ec.common.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Redis 操作 Service
 *
 * @author RsosoR
 * @date 2022/2/15
 */
public interface RedisService {

    /**
     * 保存屬性
     */
    void set(String key, Object value, long time);

    /**
     * 保存屬性
     */
    void set(String key, Object value);

    /**
     * 獲取屬性
     */
    Object get(String key);

    /**
     * 刪除屬性
     */
    Boolean del(String key);

    /**
     * 批量刪除屬性
     */
    Long del(List<String> keys);

    /**
     * 設置過期時間
     */
    Boolean expire(String key, long time);

    /**
     * 獲取過期時間
     */
    Long getExpire(String key);

    /**
     * 判斷是否有該屬性
     */
    Boolean hasKey(String key);

    /**
     * 按 delta 遞增
     */
    Long incr(String key, long delta);

    /**
     * 按 delta 遞減
     */
    Long decr(String key, long delta);

    /**
     * 獲取 Hash 結構中的屬性
     */
    Object hGet(String key, String hashKey);

    /**
     * 向 Hash 結構中放入一個屬性
     */
    Boolean hSet(String key, String hashKey, Object value, long time);

    /**
     * 向 Hash 結構中放入一個屬性
     */
    void hSet(String key, String hashKey, Object value);

    /**
     * 直接獲取整個 Hash 結構
     */
    Map<Object, Object> hGetAll(String key);

    /**
     * 直接設置整個 Hash 結構
     */
    Boolean hSetAll(String key, Map<String, Object> map, long time);

    /**
     * 直接設置整個 Hash 結構
     */
    void hSetAll(String key, Map<String, ?> map);

    /**
     * 刪除 Hash 結構中的屬性
     */
    void hDel(String key, Object... hashKey);

    /**
     * 判斷 Hash 結構中是否有該屬性
     */
    Boolean hHasKey(String key, String hashKey);

    /**
     * Hash 結構中屬性遞增
     */
    Long hIncr(String key, String hashKey, Long delta);

    /**
     * Hash 結構中屬性遞減
     */
    Long hDecr(String key, String hashKey, Long delta);

    /**
     * 獲取 Set 結構
     */
    Set<Object> sMembers(String key);

    /**
     * 向 Set 結構中添加屬性
     */
    Long sAdd(String key, Object... values);

    /**
     * 向 Set 結構中添加屬性
     */
    Long sAdd(String key, long time, Object... values);

    /**
     * 是否為 Set 中的屬性
     */
    Boolean sIsMember(String key, Object value);

    /**
     * 獲取 Set 結構的長度
     */
    Long sSize(String key);

    /**
     * 刪除 Set 結構中的屬性
     */
    Long sRemove(String key, Object... values);

    /**
     * 獲取 List 結構中的屬性
     */
    List<Object> lRange(String key, long start, long end);

    /**
     * 獲取 List 結構的長度
     */
    Long lSize(String key);

    /**
     * 根據索引獲取 List 中的屬性
     */
    Object lIndex(String key, long index);

    /**
     * 向 List 結構中添加屬性
     */
    Long lPush(String key, Object value);

    /**
     * 向 List 結構中添加屬性
     */
    Long lPush(String key, Object value, long time);

    /**
     * 向 List 結構中批量添加屬性
     */
    Long lPushAll(String key, Object... values);

    /**
     * 向 List 結構中批量添加屬性
     */
    Long lPushAll(String key, Long time, Object... values);

    /**
     * 從 List 結構中移除屬性
     */
    Long lRemove(String key, long count, Object value);
}
