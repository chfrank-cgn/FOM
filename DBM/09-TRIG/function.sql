set sql_mode='STRICT_ALL_TABLES';

-- use database
use mydb;

-- drop function
drop function if exists helloworld;

-- create helloworld
create function helloworld() returns varchar(50) deterministic
   return 'Hello World from SQL Function';

-- execute helloworld
select helloworld();

-- drop function
drop function if exists func_concat;

-- create func_concat
create function func_concat(a char(60), b char(60)) returns varchar(130) deterministic
   return concat(trim(a), ' ', trim(b));

-- execute func_concat
select func_concat('    John    ', '    Doe  ');
select func_concat('Title: ',title) as Headline from mytable;

-- drop procedure
drop procedure if exists proc_filter;

-- create proc_filter
delimiter $$
create procedure proc_filter(s varchar(30))
begin
   select id, title, sort from mytable where title like concat('%',s,'%');
end $$
delimiter ;

-- execute proc_func
call proc_filter('it');

