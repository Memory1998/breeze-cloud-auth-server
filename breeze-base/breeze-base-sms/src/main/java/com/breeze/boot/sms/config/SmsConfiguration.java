/*
 * Copyright (c) 2023, gaoweixuan (breeze-cloud@foxmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.breeze.boot.sms.config;

import com.aliyun.auth.credentials.Credential;
import com.aliyun.auth.credentials.provider.StaticCredentialProvider;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 短信配置
 *
 * @author gaoweixuan
 * @date 2023/05/31
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(SmsProperties.class)
public class SmsConfiguration {

    @Getter
    private final SmsProperties smsProperties;

    @Bean
    public StaticCredentialProvider credentialsProvider() {
        // 客户端配置 Configure the Client
        return StaticCredentialProvider.create(Credential.builder()
                .accessKeyId(smsProperties.getAccessKeyId())
                .accessKeySecret(smsProperties.getAccessKeySecret())
                .build());

    }

}
