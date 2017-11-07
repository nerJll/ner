﻿#
# 客戶信貸信息表
#
DROP TABLE IF EXISTS aiko_credit;
CREATE TABLE aiko_credit (
  id varchar(50) NOT NULL,
  customer_code varchar(100) default NULL,
  customer_name varchar(100) default NULL,
  amount numeric default 0,
  used_amount numeric default 0,
  remaining_amount numeric default 0,
  start_date datetime default NULL,
  end_date datetime default NULL,
  create_date datetime default NULL,
  create_user varchar(50) default NULL,
  status int(11) default 1,
  type int(11) default 0,
  des varchar(500) default NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

