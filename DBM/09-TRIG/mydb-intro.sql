/*
  Datei: 06-DDL-00.Intro.sql
  Autor: Peter Hecker
   Kurs: Datenbankmanagement 2019
*/

-- 'mydb' Datenbank löschen 
drop database if exists mydb;

-- 'mydb' Datenbank erstellen
create database if not exists mydb;

-- 'mydb' Datenbank auswählen
use mydb;

-- 'mytable' Tabelle löschen
drop table if exists mytable;

-- 'mytable' Tabelle ertellen
create table if not exists mytable (
    id int unsigned not null auto_increment primary key,
    title varchar(60) not null,
    sort int unsigned default 0,
    price numeric(7, 2) default 0.0,
    category enum('A', 'B', 'C'),
    is_active bool default true
);
create index ix_title on mytable(title);
create index ix_sort on mytable(sort);

-- 'mytable_log' Tabelle löschen
drop table if exists mytable_log;

-- 'mytable' Tabelle ertellen
create table if not exists mytable_log (
    id int unsigned not null,
    title varchar(60) not null,
    sort int unsigned default 0,
    price numeric(7, 2) default 0.0,
    category enum('A', 'B', 'C'),
    is_active bool default true,
    sql_action enum('INSERT', 'UPDATE', 'DELETE'),
    changed_at timestamp default current_timestamp
);

