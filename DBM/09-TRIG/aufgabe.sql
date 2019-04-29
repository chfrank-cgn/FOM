set sql_mode='STRICT_ALL_TABLES';

-- use database
use northwind;

-- drop function
drop function if exists calc_tax;

-- create calc_tax
create function calc_tax(price decimal(19,4), tax_rate decimal(19,4)) returns decimal(19,4) deterministic
   return price * (1 + tax_rate/100);

-- execute calc_tax
-- select calc_tax(34.20, 19);

-- drop procedure
drop procedure if exists show_wtax;

-- create procedure
delimiter $$
create procedure show_wtax()
begin
   select id, product_name, list_price, calc_tax(list_price,19) from products;
end $$
delimiter ;

-- execute procedure
call show_wtax();

