package com.rsosor.ec.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Minio Bucket 訪問策略配置
 *
 * @author RsosoR
 * @date 2022/2/22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class BucketPolicyConfigDto {

    private String Version;

    private List<Statement> Statement;

    @Data
    @EqualsAndHashCode(callSuper = false)
    @Builder
    public static class Statement {
        private String Effect;
        private String Principal;
        private String Action;
        private String Resource;
    }
}
