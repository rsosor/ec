package com.rsosor.ec.service;

import com.rsosor.ec.dto.OssCallbackResult;
import com.rsosor.ec.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * Oss 對象存儲管理 Service
 *
 * @author RsosoR
 * @date 2022/2/22
 */
public interface OssService {

    /**
     * Oss 上傳策略生成
     */
    OssPolicyResult policy();

    /**
     * Oss 上傳成功回調
     */
    OssCallbackResult callback(HttpServletRequest request);
}
