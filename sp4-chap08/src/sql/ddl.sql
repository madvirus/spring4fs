create user 'spring4'@'localhost' identified by 'spring4';

create database sample character set=utf8;

grant all privileges on sample.* to 'spring4'@'localhost';

create table sample.MEMBER (
	ID int auto_increment primary key,
	EMAIL varchar(255),
	PASSWORD varchar(100),
	NAME varchar(100),
	REGDATE datetime,
	unique key (EMAIL) 
) engine=InnoDB character set = utf8;