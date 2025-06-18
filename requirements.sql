CREATE DATABASE junitsdb;
CREATE USER 'junitsuser'@'localhost' IDENTIFIED BY 'junits123';
GRANT ALL PRIVILEGES ON junitsdb.* TO 'junitsuser'@'localhost';
FLUSH PRIVILEGES;