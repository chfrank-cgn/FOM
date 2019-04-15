set sql_mode='STRICT_ALL_TABLES';

-- use database
use shopdb;

-- update sales
update sales set order_date=current_date where customer_id=1;

-- delete customer record
delete from sales where customer_id=4;

-- show results
select * from sales;

