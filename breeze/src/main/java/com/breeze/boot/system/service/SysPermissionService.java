/*
 * Copyright (c) 2021-2022, gaoweixuan (breeze-cloud@foxmail.com).
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

package com.breeze.boot.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.breeze.boot.security.entity.PermissionDTO;
import com.breeze.boot.system.domain.SysPermission;

/**
 * 系统数据权限服务
 *
 * @author breeze
 * @date 2022-10-30
 */
public interface SysPermissionService extends IService<SysPermission> {

    /**
     * 分页列表
     *
     * @param permissionDTO 许可dto
     * @return {@link Page}<{@link SysPermission}>
     */
    Page<SysPermission> listPage(PermissionDTO permissionDTO);

}
