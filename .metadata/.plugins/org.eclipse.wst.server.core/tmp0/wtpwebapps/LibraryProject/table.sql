
create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	address varchar2(50),
	age number(3)
);

insert into member(id, pw, name, address, age) values('test', '1234', 'yangyoung', '경기도 성남시 서현동', 18);
insert into member(id, pw, name, address, age) values('test2', '5678', '양영2', '경기도 성남시 서현동', 17);
insert into member(id, pw, name, address, age) values('candy', 'candy1234', '캔디', '경기도 성남시 불정로 386번길', 20);
insert into member(id, pw, name, address, age) values('admin', 'admin1234', '관리자', '양영 도서관', 50);

select * from member order by id asc;


drop sequence book_seq;

create sequence book_seq;


drop table book;

create table book(
	num number(6) primary key,
	title varchar2(40),
	author varchar2(20),
	company varchar2(50),
	price number(6),
	rent char(1)
);


insert into book(num, title, author, company, price, rent) values(book_seq.nextval, '모모', '미하엘 엔데', '비룡소', 11000, 'f');
insert into book(num, title, author, company, price, rent) values(book_seq.nextval, '장미의 이름', '움베르토 에코', '열린책들', 25000, 'f');
insert into book(num, title, author, company, price, rent) values(book_seq.nextval, '수레바퀴 밑에서', '헤르만 헤세', '어문각', 10000, 'f');
insert into book(num, title, author, company, price, rent) values(book_seq.nextval, '모리와 함께한 화요일', '미치 엘봄', '살림', 10800, 'f');
insert into book(num, title, author, company, price, rent) values(book_seq.nextval, '연금술사', '파울로 코엘료', '문학동네', 9500, 'f');
insert into book(num, title, author, company, price, rent) values(book_seq.nextval, '앵무새 죽이기', '하퍼 리', '열린책들', 13000, 'f');
insert into book(num, title, author, company, price, rent) values(book_seq.nextval, '작은 아씨들', '루이자 메이', '윌북', 15800, 'f');
insert into book(num, title, author, company, price, rent) values(book_seq.nextval, '라틴어 수업', '한동일', '흐름출판', 15000, 'f');
insert into book(num, title, author, company, price, rent) values(book_seq.nextval, '좁은문', '앙드레 지드', '열린책들', 10800, 'f');
insert into book(num, title, author, company, price, rent) values(book_seq.nextval, '페르마의 마지막 정리', '사이먼 싱', '경문사', 10000, 'f');

select * from book order by num asc;
select * from book where title like '%장미%';


create sequence rent_seq;

create table rent_book(
	rent_num number(6) primary key,
	member_id varchar2(20),
	book_num number(6),
	member_name varchar2(20),
	title varchar2(40)

);

insert into rent_book(rent_num, member_id, book_num, member_name, title) values(rent_seq.nextval, 'candy', '1', '캔디', '모모');

select * from rent_book order by rent_num asc;


