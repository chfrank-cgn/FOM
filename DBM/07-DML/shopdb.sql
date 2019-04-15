
set sql_mode='STRICT_ALL_TABLES';

-- create sample database
drop database if exists shopdb;
create database shopdb;

-- use database
use shopdb;

-- create tables
drop table if exists product;
create table product (
	id int unsigned not null auto_increment primary key,
	name varchar(50) not null unique,
	description varchar(255) not null default 'Not defined',
	price decimal(9,2),
	created_at timestamp default current_timestamp,
	updated_at timestamp default current_timestamp on update current_timestamp
);
drop table if exists customer;
create table customer (
	id int unsigned not null auto_increment primary key,
	last_name varchar(50) not null,
	first_name varchar(50),
	email varchar(255) not null unique,
	street varchar(50),
	zipcode varchar(50),
	city varchar(50),
	created_at timestamp default current_timestamp,
	updated_at timestamp default current_timestamp on update current_timestamp
);
drop table if exists sales;
create table sales (
	id int unsigned not null auto_increment primary key,
	product_id int not null,
	customer_id int not null,
	order_date date not null default '1970-01-01',
	quantity int unsigned not null,
	price decimal(9,2),
	created_at timestamp default current_timestamp,
	updated_at timestamp default current_timestamp on update current_timestamp,
	foreign key (product_id) references product(id),
	foreign key (customer_id) references customer(id)
);

-- create indices
create index ix_lastname_customer on customer(last_name);
create index ix_firstname_customer on customer(first_name);
create index ix_name_product on product(name);

-- show results
show tables;

