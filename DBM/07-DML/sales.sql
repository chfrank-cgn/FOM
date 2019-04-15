set sql_mode='STRICT_ALL_TABLES';

-- use database
use shopdb;

-- insert sales
insert into sales(product_id, customer_id, quantity, price) values(1,1,2,1000.00);
insert into sales(product_id, customer_id, quantity, price) values(1,2,2,1000.00);
insert into sales(product_id, customer_id, quantity, price) values(1,3,2,1000.00);
insert into sales(product_id, customer_id, quantity, price) values(1,4,2,1000.00);
insert into sales(product_id, customer_id, quantity, price) values(2,1,4,2000.00);
insert into sales(product_id, customer_id, quantity, price) values(2,2,4,2000.00);
insert into sales(product_id, customer_id, quantity, price) values(2,3,4,2000.00);
insert into sales(product_id, customer_id, quantity, price) values(2,4,4,2000.00);
insert into sales(product_id, customer_id, quantity, price) values(3,1,6,3000.00);
insert into sales(product_id, customer_id, quantity, price) values(3,2,6,3000.00);
insert into sales(product_id, customer_id, quantity, price) values(3,3,6,3000.00);
insert into sales(product_id, customer_id, quantity, price) values(3,4,6,3000.00);
insert into sales(product_id, customer_id, quantity, price) values(4,1,8,4000.00);
insert into sales(product_id, customer_id, quantity, price) values(4,2,8,4000.00);
insert into sales(product_id, customer_id, quantity, price) values(4,3,8,4000.00);
insert into sales(product_id, customer_id, quantity, price) values(4,4,8,4000.00);

-- show results
select * from sales;


