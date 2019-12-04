/*
Navicat MySQL Data Transfer

Source Server         : 禅道
Source Server Version : 50505
Source Host           : 127.0.0.1:3306
Source Database       : springbootdb

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-12-03 15:35:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL COMMENT '用户编号',
  `name` varchar(255) NOT NULL COMMENT '用户姓名',
  `password` varchar(255) NOT NULL COMMENT '用户密码',
  `description` varchar(255) DEFAULT NULL COMMENT '描述'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
