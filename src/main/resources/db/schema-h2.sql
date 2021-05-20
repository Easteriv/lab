
DROP TABLE IF EXISTS dc_role;
DROP TABLE IF EXISTS dc_user;
DROP TABLE IF EXISTS dc_user_role;

CREATE TABLE dc_role
(
  id bigint(20) NOT NULL  COMMENT '主键',
  code varchar(255) DEFAULT NULL COMMENT '角色code',
  description varchar(255) DEFAULT NULL COMMENT '角色描述',
  gmt_create datetime DEFAULT NULL COMMENT '创建日期',
  gmt_modified datetime DEFAULT NULL COMMENT '修改日期',
  is_deleted tinyint(4) DEFAULT NULL COMMENT '0：未删除 1:已删除',
  creator bigint(20) DEFAULT NULL COMMENT '创建人',
  modifier bigint(20) DEFAULT NULL COMMENT '修改人',
  creator_name varchar(255) DEFAULT NULL COMMENT '创建人姓名',
  modifier_name varchar(255) DEFAULT NULL COMMENT '修改人姓名',
  version int(11) DEFAULT NULL COMMENT '版本号',
  PRIMARY KEY (id)
);

CREATE TABLE `dc_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `full_name` varchar(255) DEFAULT NULL COMMENT '名字',
  `pass_word` varchar(255) DEFAULT NULL COMMENT '密码',
  `enabled` tinyint(4) DEFAULT NULL COMMENT '是否可用',
  `is_deleted` tinyint(4) DEFAULT NULL COMMENT '0:未删除 1:删除',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `creator` bigint(20) DEFAULT NULL COMMENT '创建人ID',
  `modifier` bigint(20) DEFAULT NULL COMMENT '修改人ID',
  `creator_name` varchar(255) DEFAULT NULL COMMENT '创建人名字',
  `modifier_name` varchar(255) DEFAULT NULL COMMENT '修改人名字',
  `version` int(11) DEFAULT NULL COMMENT '版本号',
  PRIMARY KEY (`id`)
);

CREATE TABLE `dc_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色Id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户Id',
  `is_deleted` tinyint(4) DEFAULT NULL COMMENT '0:未删除 1:删除',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `creator` bigint(20) DEFAULT NULL COMMENT '创建人id',
  `modifier` bigint(20) DEFAULT NULL COMMENT '修改人id',
  `creator_name` varchar(255) DEFAULT NULL COMMENT '创建人姓名',
  `modifier_name` varchar(255) DEFAULT NULL COMMENT '修改人姓名',
  `version` int(11) DEFAULT NULL COMMENT '版本号',
  PRIMARY KEY (`id`)
)

