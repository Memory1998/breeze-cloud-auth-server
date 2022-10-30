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

package com.breeze.boot.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.boot.security.entity.PermissionDTO;
import com.breeze.boot.system.domain.SysRolePermission;
import com.breeze.boot.system.mapper.SysRolePermissionMapper;
import com.breeze.boot.system.service.SysRolePermissionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * 系统角色权限服务impl
 *
 * @author breeze
 * @date 2022-10-30
 */
@Service
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionMapper, SysRolePermission> implements SysRolePermissionService {

    /**
     * 角色权限列表
     *
     * @param roleIdSet 角色id设置
     * @return {@link List}<{@link PermissionDTO}>
     */
    @Override
    public List<PermissionDTO> listRolesPermission(Set<Long> roleIdSet) {
        return this.baseMapper.listRolesPermission(roleIdSet);
    }

}




