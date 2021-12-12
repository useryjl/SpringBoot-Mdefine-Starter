CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_pwd` varchar(50) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL COMMENT '用户性别：女=0；男=1',
  `email` varchar(50) DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  `user_type` int(11) DEFAULT NULL COMMENT '角色类型：学生=0；宿舍管理员=1；后勤中心=2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20239223 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户信息表';
