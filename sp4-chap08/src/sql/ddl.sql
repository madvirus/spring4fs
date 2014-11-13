create user 'spring4'@'localhost' identified by 'spring4';

create database spring4fs character set=utf8;

grant all privileges on spring4fs.* to 'spring4'@'localhost';

create table spring4fs.MEMBER (
	ID int auto_increment primary key,
	EMAIL varchar(255),
	PASSWORD varchar(100),
	NAME varchar(100),
	REGDATE datetime,
	unique key (EMAIL) 
) engine=InnoDB character set = utf8;