/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50542
 Source Host           : localhost
 Source Database       : MyBatisLearning

 Target Server Type    : MySQL
 Target Server Version : 50542
 File Encoding         : utf-8

 Date: 07/30/2016 16:01:53 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `COMMAND` varchar(16) DEFAULT NULL,
  `DESCRIPTION` varchar(32) DEFAULT NULL,
  `CONTENT` varchar(2048) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `message`
-- ----------------------------
BEGIN;
INSERT INTO `message` VALUES ('1', '查看', '精彩内容', '精彩内容'), ('2', '段子', '精彩段子', '如果你的月薪是3000块，那么这就是一个段子'), ('3', 'look', '精彩内容', '精彩内容');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
