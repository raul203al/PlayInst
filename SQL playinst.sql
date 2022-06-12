use playinst;
CREATE TABLE user(
email VARCHAR(100) PRIMARY KEY,
username VARCHAR(12) UNIQUE,
password VARCHAR(16)
);