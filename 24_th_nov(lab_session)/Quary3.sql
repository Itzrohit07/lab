show databases;
drop database c2201;
create table CUSTOMER(Cust_id varchar(5),
Fname varchar(15),Lname varchar(15),Area char(2),phone bigint(10),
DOB date ,Payment numeric(6));                     
insert into CUSTOMER values
('A01','Ivan','Rose','SA',6125467,'86-01-15',800.50),
('A02','Vandana','Ray','MU',5560379,'86-12-20',1000.75),
('A03','pramada','Jauguste','DA',4560389,'67-07-25',500.50),
('A04','Basu','Navindi','BA',6125401,'56-02-29',860.00),
('A05','Shridhar','NA',null,'89-02-15',500.50),
('A06','Rukmini','Aiyer','GH',5125274,'87-07-23',1500.50),
select *from CUSTOMER;
INSERT INTO CUSTOMER(Cust_id,Fname,Lname,Area,Phone,DOB,Payment)
VALUES('A07','ROHIT','MAITY','BA',6125401,'50-02-29',860.00);

select *from CUSTOMER;

#update the phone numbers of customer A02 and A04.
update CUSTOMER set Phone=234568 where cust_id='A03';
update CUSTOMER set Phone=354876 where cust_id='A02';

# update the date of birth of customer A03 AND A05
update CUSTOMER set DOB='1987-08-22' where cust_id=A03;
update CUSTOMER set Dob='1967-07-21' where cust_id=A05;
select *from CUSTOMER;

delete from CUSTOMER where cust_id='A01' and cust_id='A05';
delete from CUSTOMER;
INSERT INTO CUSTOMER VALUES;
('A01','Ivan','Rose','SA',6125467,'86-01-15',800.50),
('A02','Vandana','Ray','MU',5560379,'86-12-20',1000.75),
('A03','pramada','Jauguste','DA',4560389,'67-07-25',500.50),
('A04','Basu','Navindi','BA',6125401,'56-02-29',860.00),
('A05','Shridhar','NA',null,'89-02-15',500.50),
#update one record based on any criteria according to your own wish
update CUSTOMER set Fname='ROHIT', where cust_id='A01';

#delete any 1 record from the table based on particualr criteria
DELETE FROM CUSTOMER WHERE Lname='Ray';



