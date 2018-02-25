/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : javaexample

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2017-12-20 10:41:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `UserFirstName` varchar(255) DEFAULT NULL,
  `UserLastName` varchar(255) DEFAULT NULL,
  `UserName` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
SET FOREIGN_KEY_CHECKS=1;
