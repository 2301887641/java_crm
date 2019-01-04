-- ----------------------------
-- Table structure for crm_user
-- ----------------------------
DROP TABLE IF EXISTS crm_user;
CREATE TABLE crm_user (
	id INT(11) NOT NULL AUTO_INCREMENT,
	create_time timestamp  not null  default CURRENT_TIMESTAMP,
	update_time timestamp  not null  default CURRENT_TIMESTAMP,
	mobile CHAR(11) NOT NULL DEFAULT '' comment '手机号',
	username VARCHAR(36) NOT NULL DEFAULT '' comment '账号',
	email VARCHAR(46) NOT NULL DEFAULT '' comment '邮箱',
	password VARCHAR(64) NOT NULL comment '密码',
	salt VARCHAR(32) NOT NULL comment '密码盐',
  avatar VARCHAR(100) NOT NULL DEFAULT '' comment '头像',
	administrator TINYINT(1) NOT NULL DEFAULT 0 comment '是否超级管理员 1超管',
	status TINYINT(4) NOT NULL DEFAULT 0 comment '账号状态 0正常',
	register_ip CHAR(15) NOT NULL DEFAULT '' comment '登陆ip',
	PRIMARY KEY (id),
	UNIQUE KEY (mobile),
	UNIQUE KEY (username),
	UNIQUE KEY (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO crm_user (id, mobile, username, email, password, salt, avatar, administrator, status, register_ip) VALUES (1,'15865658745', 'admin', '15478541254@126.com', '$2a$10$AXJY/pLHIJKk3c8F5L6sfeaS6ypLI0IpWfBhYfxepJerb0ZO3xMt2', 'sdfsdf', 'dfgdgdfg', 1, 0, '192.168.2.12');