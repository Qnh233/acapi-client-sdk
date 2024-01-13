package com.hao.acapiclientsdk;

import com.hao.client.AcApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 必燃
 * @version 1.0
 * @create 2024-01-12 15:26
 */
@Configuration
@ConfigurationProperties("acapi.client")
@Data
@ComponentScan
public class AcApiClientConfig {

    private String accessKey;
    private String secretKey;

    @Bean
    public AcApiClient acApiClient()
    {
        return new AcApiClient(accessKey,secretKey);
    }
}
