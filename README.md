# Breeze-boot

### 平台简介

##### Breeze-boot 是基于 Spring Boot 2、JDK 8 和 Spring Security + spring-security-oauth2-authorization-server 的 RBAC 权限管理系统。它提供用户、角色、菜单和权限管理功能，并支持使用 bpmnJS 绘制 Flowable 流程图。适合 Java 开发者入门学习或实际开发使用。

- 前端采用Vue、Element UI PLUS、VITE、TypeScript。
- 后端采用Spring Boot JDK8、Spring Security + spring-security-oauth2-authorization-server、Flowable（审批流程）、Redis、Jwt、Druid。
- 权限认证使用Jwt、支持按钮级别的权限控制。
- 支持加载动态权限菜单。
- 前端代码，请移步。
    - [github：vue + vite + TS 版本](https://github.com/breeze-boot/breeze-vite-ui.git)
    - [gitee: vue + vite + TS 版本](https://gitee.com/breeze-boot/breeze-vite-ui.git)

### 特别鸣谢：
- [验证码： https://gitee.com/anji-plus/captcha](https://gitee.com/anji-plus/captcha)
- [流程设计器： https://gitee.com/MiyueSC/bpmn-process-designer](https://gitee.com/MiyueSC/bpmn-process-designer)
- [流程设计器：VUE3版本 https://gitee.com/xlys998/bpmn-vue3](https://gitee.com/xlys998/bpmn-vue3)
- [cron表达式编辑器：VUE3版本 https://github.com/wuchuanpeng/no-vue3-cron](https://github.com/wuchuanpeng/no-vue3-cron)

# 请遵循 Apache 2.0 协议

### 代码结构

- breeze-boot \
  ├─ breeze-boot \
  │ ├─ src \
  │ │ ├─ src\java\com\breeze\boot\..\modules\bpm    【任务流相关的包】 \
  │ │ ├─ src\java\com\breeze\boot\..\modules\system 【系统相关的包】 \
  │ │ ├─ src\java\com\breeze\boot\..\modules\auth   【权限相关的包】 \
  ├─ breeze-base \
  │ ├─ breeze-base-core \
  │ ├─ breeze-base-log \
  │ ├─ breeze-base-mail \
  │ ├─ breeze-base-oss-s3 \
  │ ├─ breeze-base-security \
  │ ├─ breeze-base-validator \
  │ ├─ breeze-base-message\
  │ ├─ breeze-base-redis-cache\
  │ ├─ breeze-base-mail \
  │ ├─ breeze-base-xss  \
  │ ├─ breeze-base--doc  \
  │ ├─ breeze-...
  ├─ breeze-monitor                                  监控服务（SpringBoot项目）】 \
  ├─ flowable-ui-app-server                         【Flowable-UI官方项目 可启动】

### 前端界面相关

### 登录页
![login.png](doc/images/login.png)
### 首页
![home.png](doc/images/home.png)
### 布局1
![img_1.png](doc/images/img_1.png)
### 布局2
![img_2.png](doc/images/img_2.png)
### 布局3
![img_3.png](doc/images/img_3.png)
### 布局4
![img_4.png](doc/images/img_4.png)
### flowable bpmn
![flowable bpmn](doc/images/flowable.jpg)


