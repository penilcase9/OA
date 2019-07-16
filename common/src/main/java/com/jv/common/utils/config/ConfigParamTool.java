package com.jv.common.utils.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置的值
 */
@Component
public class ConfigParamTool {
    
    /**
     *用户名称。
     */
    public String dbUsersList;
}
