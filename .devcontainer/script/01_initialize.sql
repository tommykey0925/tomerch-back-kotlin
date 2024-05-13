-- DB切り替え
\c postgres

SET SESSION timezone TO 'JST';

-- テーブル作成
CREATE TABLE IF NOT EXISTS item_category (
  object_id VARCHAR(13),
  registered_datetime timestamp WITH TIME ZONE,
  updated_datetime timestamp WITH TIME ZONE,
  category_id VARCHAR(13) NOT NULL,
  category_name VARCHAR(13),
  PRIMARY KEY (object_id)
);
CREATE TABLE IF NOT EXISTS item (
  object_id VARCHAR(13),
  registered_datetime timestamp with time zone,
  updated_datetime timestamp with time zone,
  category_id VARCHAR(13) not null,
  item_id VARCHAR(13) not null,
  item_name VARCHAR(13),
  price INTEGER not null default 0,
  PRIMARY KEY (object_id)
);

-- 権限追加
-- GRANT ALL PRIVILEGES ON smpl TO tom;
-- GRANT ALL PRIVILEGES ON smpl TO tom;

-- サンプルレコード作成
insert into item_category values('obj1','2024-01-01 00:00:00','2024-01-01 00:00:00','1','clothes');
insert into item_category values('obj2','2024-01-01 00:00:00','2024-01-01 00:00:00','2','books');
insert into item_category values('obj3','2024-01-01 00:00:00','2024-01-01 00:00:00','3','shoes');

insert into item values('obj1','2024-01-01 00:00:00','2024-01-01 00:00:00','1','1','shirt', 1000);
insert into item values('obj2','2024-01-01 00:00:00','2024-01-01 00:00:00','1','2','knit hat', 1000);
insert into item values('obj3','2024-01-01 00:00:00','2024-01-01 00:00:00','1','3','trouser', 1000);
insert into item values('obj4','2024-01-01 00:00:00','2024-01-01 00:00:00','2','4','芥川龍之介 河童');
insert into item values('obj5','2024-01-01 00:00:00','2024-01-01 00:00:00','2','5','芥川龍之介 地獄変');
insert into item values('obj6','2024-01-01 00:00:00','2024-01-01 00:00:00','2','6','芥川龍之介 十円札');
insert into item values('obj7','2024-01-01 00:00:00','2024-01-01 00:00:00','3','7','spitfire', 1000);
insert into item values('obj8','2024-01-01 00:00:00','2024-01-01 00:00:00','3','8','dickies', 1000);
insert into item values('obj9','2024-01-01 00:00:00','2024-01-01 00:00:00','3','9','santacruz', 1000);
