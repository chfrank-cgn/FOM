set sql_mode='STRICT_ALL_TABLES';

-- use database
use shopdb;

-- insert customer
insert into customer(last_name, first_name, email) values('Name 1', 'First 1', 'mail1@gmail.com');
insert into customer(last_name, first_name, email) values('Name 2', 'First 2', 'mail2@gmail.com');
insert into customer(last_name, first_name, email) values('Name 3', 'First 3', 'mail3@gmail.com');
insert into customer(last_name, first_name, email, zipcode) values('Name 4', 'First 4', 'mail4@gmail.com', '50670');

-- show results
select * from customer;


