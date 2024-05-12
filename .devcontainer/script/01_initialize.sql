-- 作成したDBへ切り替え
\c postgres

-- ロールの作成
CREATE ROLE tom WITH LOGIN PASSWORD 'postgres';
