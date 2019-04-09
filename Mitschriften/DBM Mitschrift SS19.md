
# Datenbank Management SS19 (3/11/19)
Peter Hecker

[MySQL Handbuch](https://dev.mysql.com/doc/refman/8.0/en/)

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


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTIxMTI3ODgzNjIsMjA2MDI5MTgzOSwtMT
E0NDI1MjU1NCw2ODgyMzk1MzgsNzMwOTk4MTE2XX0=
-->