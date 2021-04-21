-- 회원테이블
create table member(
	num int not null auto_increment primary key,
	id varchar(20) not null,
	pass varchar(20) not null,
	name varchar(20) not null,
	age int not null,
	phone varchar(20),
	email varchar(50)
);

insert into member(id, pass, name, age, phone, email)
values('admin', 'admin','관리자','30', '010-1111-1111', 'admin@naver.com');

select * from member;

