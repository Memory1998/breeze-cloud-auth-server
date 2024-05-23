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

package com.breeze.boot.security.jackson2;

import cn.hutool.core.collection.CollUtil;
import com.breeze.boot.core.base.BaseLoginUser;
import com.breeze.boot.security.utils.SecurityUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.util.Objects;

/**
 * 字段数据权限进行序列化
 *
 * @author gaoweixuan
 * @since 2024/02/17
 */
@NoArgsConstructor
public class SecuredFieldSerialize extends JsonSerializer<Object> {

    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        BaseLoginUser currentUser = SecurityUtils.getCurrentUser();
        if (Objects.isNull(currentUser) || CollUtil.isEmpty(currentUser.getPermission().getExcludeColumn())) {
            // 其他类型按照默认方式序列化
            serializers.defaultSerializeValue(value, gen);
            return;
        }
        gen.writeString("NAN");
    }

}