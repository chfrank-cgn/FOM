set sql_mode='STRICT_ALL_TABLES';

-- use database
use mydb;

-- drop trigger
drop trigger if exists trAfterInsert;
drop trigger if exists trAfterUpdate;
drop trigger if exists trBeforeDelete;

--define variable
set @inCount = 0;

-- create trigger
delimiter $$
create trigger trAfterInsert after insert on mytable for each row
begin
   set @inCount = @inCount + 1;
   insert into mytable_log values(new.id, new.title, @inCount, new.price, new.category, new.is_active, 'INSERT', current_timestamp());
end $$
delimiter ;

-- create trigger
delimiter $$
create trigger trAfterUpdate after update on mytable for each row
begin
   set @inCount = @inCount + 1;
   insert into mytable_log values(new.id, new.title, @inCount, new.price, new.category, new.is_active, 'UPDATE', current_timestamp());
end $$
delimiter ;

-- create trigger
delimiter $$
create trigger trBeforeDelete before delete on mytable for each row
begin
   set @inCount = @inCount + 1;
   insert into mytable_log values(old.id, old.title, @inCount, old.price, old.category, old.is_active, 'DELETE', current_timestamp());
end $$
delimiter ;

-- show trigger
show triggers;

-- add row
insert into mytable(title, category) values('Title 1', 'A');
insert into mytable(title, category) values('Title 2', 'B');
insert into mytable(title, category) values('Title 3', 'C');
insert into mytable(title, category) values('Title 4', 'A');
insert into mytable(title, category) values('Title 5', 'B');
insert into mytable(title, category) values('Title 6', 'C');

-- show content
select * from mytable;
select * from mytable_log;

-- update rows
update mytable set title = upper(title) where id > 0;

-- show content
select * from mytable;
select * from mytable_log;

-- delete rows
delete from mytable where category = 'B';

-- show content
select * from mytable;
select * from mytable_log;

-- update rows
update mytable set title = uuid() where category = 'C';

-- show content
select * from mytable;
select * from mytable_log;

