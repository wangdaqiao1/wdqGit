-- Table structure for `t_user`  
-- ----------------------------  
DROP TABLE IF EXISTS `t_user`;  
CREATE TABLE `t_user` (  
  `user_id` int(11) NOT NULL AUTO_INCREMENT,  
  `user_name` varchar(20) NOT NULL,  
  `user_age` varchar(20) NOT NULL,  
  PRIMARY KEY (`user_id`)  
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;  
  
-- ----------------------------  
-- Records of t_user  
-- ----------------------------  
INSERT INTO `t_user` VALUES ('2', '朱佳鹏', '25');  
INSERT INTO `t_user` VALUES ('3', '傻狍子', '150');  
INSERT INTO `t_user` VALUES ('4', 'jiuqiyuliang', '23');  
INSERT INTO `t_user` VALUES ('5', 'jiuqiyuliang', '23');  
INSERT INTO `t_user` VALUES ('6', 'jiuqiyuliang', '23');  
INSERT INTO `t_user` VALUES ('7', 'jiuqiyuliang', '23');  
INSERT INTO `t_user` VALUES ('9', 'liyintao123', '23123'); 