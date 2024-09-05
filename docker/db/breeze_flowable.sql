DROP DATABASE IF EXISTS breeze_flowable;
CREATE DATABASE breeze_flowable DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

USE breeze_flowable;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bpm_category
-- ----------------------------
DROP TABLE IF EXISTS `bpm_category`;
CREATE TABLE `bpm_category`  (
  `id` bigint NOT NULL,
  `category_code` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '流程分类编码',
  `category_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '流程分类名称',
  `create_by` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人编码',
  `create_name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人姓名',
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人编码',
  `update_name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人姓名',
  `update_time` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(1) NULL DEFAULT 0 COMMENT '是否删除 0 未删除 1 已删除',
  `delete_by` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '删除人编码',
  `tenant_id` bigint NOT NULL COMMENT '租户ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of bpm_category
-- ----------------------------
INSERT INTO `bpm_category` VALUES (1828008467692564481, 'OA', 'OA', 'admin', 'admin', '2024-09-01 17:55:56', NULL, NULL, NULL, 0, NULL, 1);

SET FOREIGN_KEY_CHECKS = 1;
