#数据库
>>>```DROP TABLE IF EXISTS `flower`;
CREATE TABLE `flower` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
 `name` varchar(30) COLLATE utf8_bin NOT NULL COMMENT '花名',
`price` float NOT NULL COMMENT '价格',
 `production` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '产地',
PRIMARY KEY (`id`)) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;```