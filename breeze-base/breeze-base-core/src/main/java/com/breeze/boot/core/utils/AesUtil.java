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

package com.breeze.boot.core.utils;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

/**
 * AES
 *
 * @author gaoweixuan
 * @date 2023/05/18
 */
public class AesUtil {

    /**
     * [算法/模式/补码方式]
     */
    private static final String ALGORITHM = "AES/ECB/PKCS5Padding";

    /**
     * 解密
     *
     * @param content 内容
     * @return {@link String}
     */
    public static String encryptBase64(String content, String key) {
        AES aes = SecureUtil.aes(key.getBytes(StandardCharsets.UTF_8));
        return aes.encryptBase64(content, StandardCharsets.UTF_8);
    }

    /**
     * 解密str
     *
     * @param content 加密密文
     * @param key     关键
     * @return {@link String}
     */
    public static String decryptStr(String content, String key) {
        AES aes = SecureUtil.aes(key.getBytes(StandardCharsets.UTF_8));
        return aes.decryptStr(content);
    }

    /**
     * 加密
     *
     * @param content 内容
     * @param key     关键
     * @return {@link String}
     */
    public static String encrypt(String content, String key) {
        if (StrUtil.isBlank(key)) {
            return "";
        }
        if (key.length() != 16) {
            return null;
        }
        try {
            byte[] raw = key.getBytes();
            //根据密码生成AES密钥
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
            //根据指定算法ALGORITHM自成密码器
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            //初始化密码器，参数:(加密(ENCRYPT_MODE)或者解密(DECRYPT_MODE),AES密钥)
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encode_content = cipher.doFinal(content.getBytes(StandardCharsets.UTF_8));
            return Base64.encodeBase64String(encode_content);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 解密
     *
     * @param content 内容
     * @param key     关键
     * @return {@link String}
     */
    public static String decrypt(String content, String key) {
        if (StrUtil.isBlank(key)) {
            return "";
        }

        if (key.length() != 16) {
            return null;
        }
        try {
            byte[] raw = key.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] byte_content = cipher.doFinal(Base64.decodeBase64(content));
            return new String(byte_content, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}