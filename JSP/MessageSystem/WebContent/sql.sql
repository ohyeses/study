1. ȸ�������� ������ ������ �� �ִ� 'web_member'���̺��� ����ÿ�.
   �÷��� : email / pw / tel / address


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

insert into message values(num.nextval, '������', '�̱⼺', '�̹��� �ݿ��Ͽ� ���ؿ�?', SYSDATE)


