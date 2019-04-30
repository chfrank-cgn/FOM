set sql_mode='STRICT_ALL_TABLES';

-- use database
use mysql;

-- show user
select user, host from user;

-- Step 1 - direct permissions

-- drop user
drop user if exists 'user1'@'localhost';

-- create user
create user 'user1'@'localhost' identified by 'user1';

-- assign direct permissions
grant show database on *.* to 'user1'@'localhost';

-- remove direct permissions
revoke show databases on *.* from 'user1'@'localhost';

-- drop user 
drop user if exists 'user1'@'localhost';

-- Step 2 - roles assignments 

-- drop roles
drop role if exists fomreader;
drop role if exists fomwriter;
drop role if exists fomdevel;

-- create roles
create role fomreader;
create role fomwriter;
create role fomdevel;

-- assign permissions
grant select on *.* to fomreader;
grant insert, update, delete on *.* to fomwriter;
grant all privileges on *.* to fomdevel;

-- drop user
drop user if exists 'user1'@'localhost';
drop user if exists 'user2'@'localhost';
drop user if exists 'user3'@'localhost';

-- assigne roles
grant fomreader to 'user1'@'localhost';
grant fomreader, fomwriter to 'user2'@'localhost';
grant fomdevel to 'user3'@'localhost';

-- show assignment
show grants;

-- set default roles
set default role all to 'user1'@'localhost';
set default role all to 'user2'@'localhost';
set default role all to 'user3'@'localhost';

-- revoke roles
revoke role fomreader on *.* from 'user1'@'localhost';
revoke role fomreader, fomwriter on *.* from 'user2'@'localhost';
revoke role fomdevel on *.* from 'user3'@'localhost';

-- drop roles
drop role if exists fomreader;
drop role if exists fomwriter;
drop role if exists fomdevel;

-- drop user
drop user if exists 'user1'@'localhost';
drop user if exists 'user2'@'localhost';
drop user if exists 'user3'@'localhost';

