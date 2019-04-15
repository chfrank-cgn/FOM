set sql_mode='STRICT_ALL_TABLES';

-- use database
use shopdb;

-- insert product
insert into product(name, description, price) values ('Test 1', 'Description 1', 100.10);
insert into product(name, description, price) values ('Test 2', 'Description 2', 200.20);
insert into product(name, description, price) values ('Test 3', 'Description 3', 300.30);
insert into product(name, price) values ('Test 4', 400.40);

-- show resulrs
select * from product;


