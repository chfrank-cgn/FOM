
# Datenbank Management SS19 (3/11/19)
Peter Hecker

[MySQL Handbuch](https://dev.mysql.com/doc/refman/8.0/en/)
[MariaDB Handbuch](https://mariadb.com/kb/en/library/documentation/)

**Klausur** (6/11):
- Theorie
	- Wissensfragen
	- Verständnisfragen
	- Transferfragen
- Praxis
	- Diagramme (Entity-Relationship)
	- SQL Statements

Wissenspyramide
- Wissen
	- Interpretation
- Information
	- Semantik
- Daten
	- Syntax
- Zeichen

**Klausur:** Slide 8 wichtig

DBS = DB + DBMS

Horizontal & vertical scaling

DD = Data Dictionary (Meta information, `system.tables`)

Relationale Datenbanken bestehen aus Tabellen 

Objektorientierte Datenbanken - db4o (bis 2012)

ACID: Atomic, Consistency, Isolation, Durability (SQL)
BASE: Basically available, soft state, eventually consistent (NoSQL)

## Modellierung (3/18/19)

**Termin 4/9:** MySQL oder MariaDB installiert haben

Vier Arten von Datenbanken:
- Netzwerk
- Hierarchisch
- Relational
- Objektorientiert

Vier Arten von NoSQL Datenbanken:
- Key/Value Store
- Document
- Graph
- Column Store

Drei Schichten:
- Extern
- Konzeptionell
- Physisch

Eigenschaften von Big Data (Skript Seite 35):
- High Volume
- High Variety
- High Velocity
- High Value
- High Veracity

Data Warehouse: **ETL** (Extract, Transform, Load)
Big Data *("Data Lake")*: **ELT** (Extract, Load, then Transform)

Ebenen der Modellierung **(Klausurrelevant)**:
- Reale Welt
- Betriebswirtschaftliche Modellierung (ARIS)
- Semantische Modellierung (ERM)
- Logische Modellierung (Datenbankmodell)
- Physische Modellierung (SQL Statements)

[Was sind Äquipollenzen?](https://www.repetico.de/card-77599370)

Entity-Relationship Model:
- UML
- Bachmann
- Chen
- Idefix

Chen-Notation:
- 1:1 Beziehung
- 1:n Beziehung
- n:m Beziehung

Die Chen-Notation erlaubt, Beziehungen mit Eigenschaften zu versehen (und nicht nur Objekte)

## Normalisierung (3/19/19)

Die 12 Regeln von Coda für relationale Datenbanken (Skript Seite 61-63, **Klausurrelevant)**
- Darstellung von Information
- Zugriff auf Daten
- Systematische Behandlung von NULL
- Struktur einer Datenbank
- Abfragesprache
- Aktualisierung von Schichten
- Abfragen und Bearbeiten ganzer Tabellen
- Physikalische Datenunabhägigkeit
- Logische Datenunabhägigkeit
- Unabhängikeit der Integrität
- Verteilungsunabhängigkeit
- Kein Unterlaufen der Abfragesprache

Erste Normalform (1NF) (Skript Seite 74):
Der Wert eines jeden Attributs ist atomar
- keine Aufzählungen
- keine zusammengesetzte Werte

Zweite Normalform (2NF) (Skript Seite 81):
1NF +  jedes Nichtschlüsselattribut ist von seinem gesamten Primärschlüssel voll funktional abhängig

Dritte Normalform (3NF) (Skript Seite 86):
2NF + kein Nichtschlüsselattribut hängt transitiv von dem Primärschlüssel ab

## Relationale Algebra (4/1/19)
fehlt

## Lookup in der Praxis (4/1/19)
fehlt

**Klausur:** Übungsaufgaben!

## SQL Objekte (4/9/19)

SQL Objekte:
- Database
- Table
- View
- Index
- Procedure
- Function
- Trigger (CRUD)
- User

DDL - Data Definition Language
DML - Data Modification Language

DDL:
- CREATE
- ALTER
- RENAME
- DROP
("IF EXISTS" / "IF NOT EXISTS")

Namenskonventionen:
- PascalCase
- camelCase
- snake_case
- kebab.case

Tabellen und Variable immer im Singular!

Primary Key: id
Foreign Key: \<tabelle\>\_id

Datentypen:
- char
- varchar
- binary
- varbinary
- tinytext (-blob)
- text (blob)
- mediumtext (-blob)
- longtext (-blob)
- smallint
- mediumint
- int
- bigint
- numeric(n,m) / decimal(n,m)
- double(n,m) / real(n,m)
- float(n,m)
- bool (1=true; 2=false; -> tinyint)

## Eingebaute Funktionen (4/15/19)

Eingebaute Funktionen (pg. 224):
- Textfunktionen
- Aggregatfunktionen
- Mathematische Funktionen
- Datumsfunktionen

[MySQL Version der Northwind-Datenbank](https://github.com/dalers/mywind)

[MySQL World Demo-Datenbank](https://dev.mysql.com/doc/world-setup/en/)

## SQL Trigger and Functions (4/29/19)

*Neue Skripte re: DML*

CREATE TRIGGER \<name\> \<time\> \<event\> ON \<table\> FOR EACH ROW \<statement\>

## SQL Security (4/30/19)

DCL - Data Control Language 

CIA - Confidentiality, Integrity, Availability - 3 zentrale Schutzziele

Elemente von RBAC: Authentifizierung, Authorisierung

## Transaktionen (5/20/19)

Klausur: select, insert, update, delete, **JOIN** 

Security: CIA (Confidentiality, Integrity, Availability) - "primäre Schutzziele"

Authentisierung, Authorisierun, Datenschutz, Datensicherheit

Notation: snake_case, Singular

**ACID:** Atomicity, Cinsostency, Isolation, Durability

**BASE:** Basically Available, Soft state, Eventual consistency

**RI:** Referentielle Integrität

Locking:
- Was - Item, Row, Table, Database
- Wie - Read, Write, Exclusive, Shared (Optimistic, Pessimistic)

## MongoDB (5/27/19)

[Dokumentation](https://www.mongodb.com/), [Vergleich](https://www.simform.com/mongodb-vs-mysql-databases/)

## Wiederholung (6/4/19)

DBS = DB + DBM

Modelle:
- Hierarchisch
- Netzwerk
- Relational
- Objektorientiert

NoSQL:
- Key-Value Store (Redis)
- Document (MongoDB)
- Column (Cassandra)
- Graph (Neo4j)

ACID / BASE

SPARK - 3-Ebenen Modell (Extern / Konzept / Intern)

OLTP, OLAP

Modellierung:
- Reale Welt
- Betriebswirtschaftliche Sicht (ARIS)
- Semantisch (ERM)
- Logisch (Normalisierung)
- Physisch (Schema)

[12 Regeln von Codd](https://www.studytonight.com/dbms/codd-rule.php)

[ERM](https://en.wikipedia.org/wiki/Entity%E2%80%93relationship_model) / ERD: [CHEN Notation](https://de.wikipedia.org/wiki/Chen-Notation) mit [Kardinalitäten](https://www.tinohempel.de/info/info/datenbank/kardinalitaet_mc.htm) 

Normalformen:
- 1NF: Jedes Attribut ist atomar (d.h. keine zusammengesetzten Werte mehr)
- 2NF: Jedes nicht-Schlüsselattribut ist funktional voll abhängig vom Primärschlüssel. Liegt kein zusammengesetzter Schlüssel vor, so ist die Tabelle auch in der 2. Normalform, sobald sie in der 1. Normalform ist
- 3NF: Kein nicht-Schlüsselattribut hängt transitiv (d.h. indirekt) vom Primärschlüssel ab.

Relationale Integrität:
- Entity Integrität: Jede Tabelle besitzt einen Primärschlüssel
- Referentielle Integrität: Jeder Fremdschlüssel einer Tabelle ist gleichzeitig auch ein Primärschlüssel einer anderen Tabelle

Relationale Algebra:
- Produkt
- Vereinigung
- Schnittmege
- Differenz

Operator:
- Selection (Zellenselektion)
- Projection (Projektion)
- Join (Verknüpfung)
- Division

Beispiel: `SELECT (projection) FROM (join/division) WHERE (selection)`

DDL - Data Definition Language
DML - Data Manipulation Language
DCL - Data Control Language

DDL: CREATE / ALTER / RENAME / DROP

Tabelle: Spalte: Name, Typ, Constraints (z.B. NULL, SET, ENUM)

Select & Join - *Pages 222, 224, 307*

DCL:
- CREATE USER
- GRANT \<permission\> ON \<table\> TO \<user\>
- REVOKE \<permission\> ON \<table\> FROM \<user\>
- SHOW PRIVILEGES

Primäre Schutzziele:
- Confidentiality
- Integrity
- Availability

Authentifizierung / Authorisierung

Datenschutz / Datensicherheit

Locks: Read / Write / Shared / Exclusive:
- optimistic / pessimistic (isolation level: serializable / repeatable read / read committed / read uncommitted)

[MongoDB](https://www.mongodb.com/)

MongoDB verwendet [MapReduce](https://mapr.com/blog/spark-101-what-it-what-it-does-and-why-it-matters/)

[CAP Theorem](https://mwhittaker.github.io/blog/an_illustrated_proof_of_the_cap_theorem/): MongoDB ist C-P, d.h. Consistent and Partition-Tolerant, aber nicht unbedingt Available

Analogien:
 - Collection = Tabelle
 - Document = Row
 - Field = Column
 
 Terminologie:
 - Collections = Sammlung von Documents 
 - Document = Geordneten Menge von Key–Value–Paaren 
 - Key = UTF8-String Value = einfacher nativer Datentyp oder Array oder Document 
 - Datentyp = String, Integer, Double, Timestamp etc.

CRUD Operationen:
- Insert:
	- db.collection.insertOne()
	- db.collection.insertMany()
- Read:
	- db.collection.find()
- Update:
	- db.collection.updateOne()
	- db.collection.updateMany()
	- db.collection.replaceOne()
- Delete:
	- db.collection.deleteOne()
	- db.collection.deleteMany()

<!--stackedit_data:
eyJoaXN0b3J5IjpbNTM1OTQxMDk3LC0xODY1MjIzMDE3LDUyNT
AxMjU0NywtMTE4MzY5NTUxLC0yMDYzMTk4NjAxLC01NzA5Nzkx
MTksLTIxMzA4NzI4MjcsMzgzNDczNjUzLDE5MDYxNDk1MzAsMT
g3NTk0MDY2NCwtMjExMjc4ODM2MiwyMDYwMjkxODM5LC0xMTQ0
MjUyNTU0LDY4ODIzOTUzOCw3MzA5OTgxMTZdfQ==
-->