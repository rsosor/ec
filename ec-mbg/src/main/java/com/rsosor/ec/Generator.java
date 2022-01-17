package com.rsosor.ec;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 用於生產 MBG 的程式
 *
 * @author RsosoR
 * @date 2022/1/15
 */
public class Generator {

    public static void main(String[] args) throws Exception {
        // MBG 執行過程中的警告消息
        List<String> warnings = new ArrayList<>();
        // 當生成的程式重覆時，覆蓋原程式
        boolean overwrite = true;
        // 讀取我們的 MBG 配置文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        // 創建 MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        // 執行生成程式
        myBatisGenerator.generate(null);
        // 輸出警告訊息
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
