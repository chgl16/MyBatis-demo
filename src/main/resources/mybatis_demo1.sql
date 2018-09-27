DROP DATABASE IF EXISTS mybatis_demo1;
CREATE DATABASE mybatis_demo1 DEFAULT CHARACTER SET utf8;

USE mybatis_demo1;
CREATE TABLE t_role(
  id BIGINT(18) NOT NULL AUTO_INCREMENT,
  role_name VARCHAR(255) NOT NULL,
  note VARCHAR(255),
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_role VALUES(1, '小明', '明日之前');
INSERT INTO t_role VALUES(2, '小米', '小米科技');
INSERT INTO t_role VALUES(3, '小红', '红色的火');