
set sql_mode='STRICT_ALL_TABLES';

-- create sample database
drop database if exists personal;
create database personal;

-- use database
use personal;

-- create tables
drop table if exists abteilung;
create table abteilung (
	id int not null auto_increment primary key,
	kuerzel char(7) not null unique,
	beschreibung varchar(60) not null,
	letzte_aenderung timestamp current_timestamp on update current_timestamp
);
drop table if exists mitarbeiter;
create table mitarbeiter (
	id int not null auto_increment primary key,
	abteilung_id int,
	nachname varchar(30) not null,
	vorname varchar(30),
	personal_nr int unsigned not null unique,
	geb_datum date default '1970-01-01',
	geschlecht enum('M', 'W', 'D') default 'D',
	titel set('Dr.', 'Prof.','Mag.'),
	letzte_aenderung timestamp current_timestamp on update current_timestamp,
	foreign key (abteilung_id) references abteilung(id)
);
drop table if exists adresse;
create table adresse (
	id int not null auto_increment primary key,
	strasse varchar(60) not null,
	plz smallint unsigned not null,
	ort varchar(30) not null,
	letzte_aenderung timestamp current_timestamp on update current_timestamp
);
drop table if exists mitarbeiter_adresse;
create table mitarbeiter_adresse (
	mitarbeiter_id int,
	adresse_id int,
	type enum('Hauptwohnsitz', 'Zweitwohnsitz') not null,
	letzte_aenderung timestamp current_timestamp on update current_timestamp,
	foreign key (mitarbeiter_id) references mitarbeiter(id),
	foreign key (adresse_id) references adresse(id)
);

-- create indices
create index ix_abteilung on abteilung(kuerzel);
create index ix_mitarbeiter on mitarbeiter(nachname);

-- show results
show tables;

