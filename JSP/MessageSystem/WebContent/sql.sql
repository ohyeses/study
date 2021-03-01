1. 회원가입한 정보를 저장할 수 있는 'web_member'테이블을 만드시오.
   컬럼명 : email / pw / tel / address


CREATE TABLE web_member(

	email varchar2(500),
	pw varchar2(500),
	tel varchar2(500),
	address varchar2(500)

);

select * from web_member;


select * from web_member where email = ? and pw = ?;

create table message (
	num number,
	send varchar2(500),
	receive varchar2(500),
	message varchar2(500),
	send_date date
)

select * from message;

create sequence num start with 1 increment by 1;

insert into message values(num.nextval, '아이유', '이기성', '이번주 금요일에 뭐해요?', SYSDATE)


