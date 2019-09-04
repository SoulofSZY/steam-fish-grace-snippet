package com.szy.code.snippet.file;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 〈一句话功能简述〉<br>
 * 〈从classpath 加载配置的一般实现〉
 *
 * @author sunzhengyu
 * @create 2019/9/2
 * @since 1.0.0
 */
public class LoadClassPathFile {

    public static Properties readClassPathPropertiesFile(String fileName) throws IOException{
        Properties properties = new Properties();
        try (BufferedInputStream bis = new BufferedInputStream(LoadClassPathFile.class.getResourceAsStream(fileName))) {
            properties.load(bis);
        }
        return properties;
    }

    public static void main(String[] args) throws IOException {
        Properties properties = readClassPathPropertiesFile("/app.properties");

        System.out.println(properties.getProperty("name"));
    }
}