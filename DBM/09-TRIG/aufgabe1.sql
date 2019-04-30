set sql_mode='STRICT_ALL_TABLES';

-- use database
use northwind;

-- drop procedure
drop procedure if exists get_product_info;

-- create procedure
delimiter $$
create procedure get_product_info(prod_id int)
begin
   -- Variablenzuweisung Variante 1
   set @count_sales = (select sum(quantity) from order_details where product_id = prod_id);
   set @sales = (select sum(quantity * unit_price) from order_details where product_id = prod_id);
   select id, product_name, category, @count_sales, @sales from products where id = prod_id;

   -- Variablenzuweisung Variante 2
   set @count_sales = 0;
   set @sales = 0;
   select @sales := sum(quantity * unit_price), @count_sales := sum(quantity) from order_details where product_id = prod_id;
   select id, product_name, category, @count_sales, @sales from products where id = prod_id;

   -- Variablenzuweisung Variante 3
   set @count_sales = 0;
   set @sales = 0;
   select @sales := sum(quantity * unit_price), @count_sales := sum(quantity) from order_details where product_id = prod_id;
   select id, product_name, category from products where id = prod_id into @id, @product_name, @category;
   select @id, @product_name, @category, @count_sales, @sales;

end $$
delimiter ;

-- execute procedure
call get_product_info(1);

