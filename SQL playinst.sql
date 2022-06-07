use playinst;
CREATE TABLE user(
email VARCHAR(100) PRIMARY KEY,
username VARCHAR(12) UNIQUE,
password VARCHAR(16)
);

drop table user;

select * from user;
INSERT INTO user VALUES ('c','c','c');