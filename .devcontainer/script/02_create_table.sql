-- DB切り替え
\c postgres

-- テーブル作成
CREATE TABLE  smpl (
  col1 VARCHAR(10),
  col2 VARCHAR(10),
  col3 VARCHAR(10),
  PRIMARY KEY (col1)
);

-- 権限追加
GRANT ALL PRIVILEGES ON smpl TO tom;

-- サンプルレコード作成
INSERT INTO smpl VALUES('1111', '2221', '3331');
INSERT INTO smpl VALUES('1112', '2222', '3332');
INSERT INTO smpl VALUES('1113', '2223', '3333');
