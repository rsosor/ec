package com.rsosor.ec;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

/**
 * 自定義注釋生成器
 *
 * @author RsosoR
 * @date 2022/1/15
 */
public class CommentGenerator extends DefaultCommentGenerator {

    private boolean addRemarkComments = false;

    private static final String EXAMPLE_SUFFIX = "Example";
    private static final String MAPPER_SUFFIX = "Mapper";
    private static final String API_MODEL_PROPERTY_FULL_CLASS_NAME = "io.swagger.annotations.ApiModelProperty";

    /**
     * 設置用戶配置的參數
     *
     * @param properties
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
    }

    /**
     * 給字段添加注釋
     *
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        String remarks = introspectedColumn.getRemarks();
        // 根據參數和備註信息判斷是否添加 swagger 註解信息
        if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
            // addFieldJavaDoc(field, remarks);
            // 數據庫中特殊字符需要轉義
            if (remarks.contains("\"")) {
                remarks = remarks.replace("\"", "'");
            }
            // 給 model 的字段添加 swagger 註解
            field.addJavaDocLine("@ApiModelProperty(value = \"" + remarks + "\")");
        }
    }

    /**
     * 給 model 的字段添加注釋
     *
     * @param field
     * @param remarks
     */
    private void addFieldJavaDoc(Field field, String remarks) {
        // 文檔注釋開始
        field.addJavaDocLine("/**");
        // 獲取數據庫字段的備註訊息
        String[] remarkLines = remarks.split(System.getProperty("line.separator"));
        for (String remarkLine: remarkLines) {
            field.addJavaDocLine(" * " + remarkLine);
        }
        addJavadocTag(field, false);
        field.addJavaDocLine(" */");
    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        super.addJavaFileComment(compilationUnit);
        // 只在 model 中添加 swagger 註解類的導入
        if (!compilationUnit.getType().getFullyQualifiedName().contains(MAPPER_SUFFIX)
                && !compilationUnit.getType().getFullyQualifiedName().contains(EXAMPLE_SUFFIX)) {
            compilationUnit.addImportedType(new FullyQualifiedJavaType(API_MODEL_PROPERTY_FULL_CLASS_NAME));
        }
    }
}
