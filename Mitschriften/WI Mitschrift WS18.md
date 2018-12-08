
## WI Klausur (10/23/18)

Praktische Klausuraufgabe:
"Diskutieren Sie den Status Quo sowie die Potentiale in Ihrem Unternehmen und zeigen Sie möglichen Handlungsempfehlungen auf"

 1. Was ist Digitalisierung?
 2. Bestandsaufnahme (Ist)
 3. Potentiale (Soll)
 4. Handlungsempfehlungen (Ist -> Soll)

Hinweis: Medienbrüche

 - Keine Bulletpoints
 - Keine Abkürzungen oder unternehmensspezifischen Ausdrücke

**Vorschreiben!**

EMail: markus.linden@fom.de (ohne Anhang, ausser PDF)

## Sinnhafte Vollautomation (10/31/18)

Sinnhaftigkeit: 

 1. Kosten
 2. Qualität
 3. Preis

> Gestaltung rechnergestützter Informationssysteme in der Wirtschaft

 - Zeichen (Atom)
 - Datum (Syntax)
 - Information (Semantik)
 - Wissen (Semiotik)
 
 **Lesen: Skript S. 19 - Zusammenfassung**

E-V-A Prinzip : Eingabe - Verarbeitung - Ausgabe

von-Neumann Architektur (-Flaschenhals, -Zyklus)
3 Bussysteme: Steuerbus, Adressbus, Datenbus
deterministisch, sequentiell

Harvard-Architektur

## Hardware & Software (11/5/18)

 - Systemsoftware
 - Anwendungssoftware
 - Entwicklungssoftware
 
 (1 Byte = 8 Bits) Giga - 10^9^ Gigi 2^30^

US-ASCII Tabelle - Umwandlung von Zahlen in Buchstaben / Symbole. Beispiel: "A" - 65
Abgelöst durch Unicode (UTF8, UTF16)

**Fragestellung:** Gehen Sie auf die Aspekte der Entwicklungsumgebung ein und erläutern Sie Interpreter, Compiler, Linker und Loader

IDE: Integrated Development Environment

## Software-Layer (11/6/18)

3-Schichten Architektur
 - Präsentation
 - Anwendungslogik
 - Datenhaltung
 
Integrierte Informationsverarbeitung
 
**Fragestellung:** Erläutern Sie, was man unter Integration versteht und gehen Sie dabei insbesondere auf den Integrationsgegenstand ein

Notwendige Literatur: Intgegration betrieblicher Informationssysteme I (Mertens)

Methodenintegration - Beispiel Maßsystem (Metric/Imperial); Deckungsbeitrag (I, II oder III)


## Enterprise Resource Planning (11/12/18)

ERP: Ganzheitliche Sicht auf die Geschäftstätigkeit eines Unternehmens

Business Process (Re-)Engineering (aka greenfield) vs Kontinuierliche Prozessverbesserung (KPV)

Unternehmensziele => Geschäftsmodell => Prozessmodellierung => Anwendung

[Business Model Canvas](https://en.wikipedia.org/wiki/Business_Model_Canvas) 
Alexander Osterwalder,  University of Lausanne, 2008

ERP:
- integriertes Anwendungspaket
- Abwicklung von Geschäftstransaktionen
- umfasst alle wesentlichen betrieblichen Funktionsbereiche

Integration durch eine zentrale Datenbank (e.g SAP/R3: Oracle, HANA)

ERP: **3-Schichten Architektur**
- Präsentation => Benutzeroberfläche
- Anwendungslogik => Module (Funktionsbereiche, siehe oben), Basissystem
- Datenhaltung => Datenbanksysteme

Business Suite: ERP + CRM + SCM

## Nutzwertanalyse

Nutzwertanalyse:
- Was?
- Wie?
- Vorteile/Nachteile?

"Analyse komplexer Handlungsalternativen mit dem Zweck, diese in Bezug auf ein Zielsystem bzw. Vorgaben zu ordnen. Die Ordnung erfolgt durch die Angabe von Nutzwerten für die jeweilige Alternative"

Ablauf:
- Definition des Ziels
- Ausschluss- und Auswahlkriterien
- Gewichtung der Ziele
- Alternativen incl. NULL, d.h. Beibehaltung des Status Quo
- Bewertung der Alternativen

Vorteile:
- Flexibilität
- Transparenz

Nachteile:
- Auswahl der Gewichtung
- Sehr subjektiv

[Enzyklopädie der Wirtschaftsinformatik](http://www.enzyklopaedie-der-wirtschaftsinformatik.de/), Universität Potsdam 

## Supply Chain Management (11/13/18)

Supply Chain = Wertschöpfungskette

Wir unterscheiden 3 (drei) Flussarten:
- physischer Warenfluss
- Zahlungsfluss
- Informationsfluss (EDI)

Vorlieferant <=> Hersteller <=> Händler

Supply Chain Management: Management der Geschäftsprozesse entlang der gesamten Wertschöpfungskette

Aufgabe: Medienbrüche vermeiden 

**XML**: eXtensible Markup Language, wird in EDI verwendet; moderne Alternative: **JSON**
- Schema/DTD enthält Meta-Information
- .xml enthält die eigentlichen Daten

**EDIFACT**: Uralter Datenübertragungsstandard

## Customer Relationship Management

CRM dient der
- Kundengewinnung
- Kundenerhaltung
	- Kundenbindung
	- Kundenausschöpfung

Cross-/Upselling

Customer Lifetime Cycle

Kernelement Kundenprofil:
- Explizite Daten
	- Registrierung
	- Bestellformular
- Implizite Date
	- Browserverhalten

Das Kundenprofil enthält die Segmentierungskriterien

*"psychographische Daten"* -> Lebensstil, Glauben, Hobbies

## Management Support Systems (11/20/18)

Fehlt

## Business Intelligence Systems (11/27/18)

Summary: (multi) Data Warehouse - receives data from ERP, CRM, SCM

Warum?
- Umfangreiche Auswertungen, über das Standard-Reporting hinaus
- Möglichkeit, Daten systemübergreifend zu verknüpfen
- Normalisierung unterschiedlicher Datenstrukturen

Prozesse: Planen - Steuern - Kontrollieren

1/ Vordefinierte Kennzahlen (**KPI**)
Standardisierte Reports (z.B. Year-To-Date)

2/ Ad-Hoc Reporting **OLAP** (Online Analytical Processing)
OLAP Navigation: (Drei-dimensionaler Würfel: z.B. Kunde - Produkt - Zeit)
- Slicing
- Dicing
- Roll-up
- Drill-down

3/ Data Mining
Eine Phase im Prozess von "Knowledge Discovery in Databases" (Fayyad)

*Lesen: Edgar F. Codd "12 Regeln zur OLAP Fähigkeit von Informationssystemen"*

*Lesen: ETL Prozess (Data Warehouse): Extract - Transform - Load*

Data Mining:
- Classification: Bildung von Klassen, z.B. Kreditwürdigkeit
- Clustering: Bildung von Gruppen, z.B. Kundentypen im CRM
- Association: Zusammenhänge erkennen, z.B. welche Artikel werden zusammen gekauft

## E-Business and E-Commerce (Tim O'Reilly)

Web 2.0 Prinzipien
- The web as platform
- Harnessing collective intelligence
- Data is the next Intel
- End of the software release cycle
- Lightweight programming model
- Software above the level of a single device (aka "Mobile First")
- Rich user experience

Enterprise 2.0
- The Long Tail "Großes Geld mit kleinen Geschäften"
	- Mache alles verfügbar
	- Hilf mir, es zu finden
- Crowdsourcing
- Crowdfunding

Web 3.0 - the semantic web
- Covenience

## Architektur von Informationssystemen

Modellierungssprache [ARIS](https://en.wikipedia.org/wiki/Architecture_of_Integrated_Information_Systems) (ARchitektur integrierter Informations Systeme)

> ARIS stützt sich hauptsächlich auf seine eigene
> Fünf-Sichten-Architektur (ARIS-Haus). Diese fünf Sichten sind die
> Organisations-, Daten-, Leistungs-, Funktions- und Steuerungssicht auf
> einen Prozess. Die Einteilung erfolgt, um die Komplexität des Modells
> in fünf Facetten aufzubrechen und so die Prozessmodellierung einfacher
> zu gestalten.

*(siehe ARIS-Modell Diagramm)*

ARIS-Sichten (Partionierung):
- Organisation: Wer macht
- Funktion: was 
- Daten: womit?
- Steuerung: Prozess
- Leistung: Ergebnis / Output

ARIS-Schichten (Beschreibungsebene)
- Fachkonzept
- DV-Konzept (IT-Konzept)
- (Technische) Implementierung

**Ereignissgesteurte Prozesskette**

## Modellierung von Geschäftsprozessen (12/4/18)

ARIS Schichten:
- Fachkonzept
- DV-Konzept
- Implementierung

ARIS Sichten:
- Organisationssicht
- Datensicht
- Steuerungssicht
- Funktionssicht
- Leistungssicht

Organisationssicht:
- Aufbauorganisation
- Organigramm

Funktionssicht:
- zu erfüllende Funktion
- Funktionshierarchiebäume
- Zieldiagramm

Datensicht:
- Definition der Daten
- Entity-Relationship Model (UML)

Steuerungssicht:
- Modellierung der Geschäftsprozesse
- [EPK (Ereignisgesteuerte Prozesskette)](https://www.der-wirtschaftsingenieur.de/index.php/ereignisgesteuerte-prozesskette-epk/)
- eEPK (erweiterte EPK)

EPK Elemente & Syntax:

[Ereignis] -> [Funktion] -> [Ereignis]
Mögliche Verknüpfungen: XOR, AND, OR (werden im Diagramm wie geschweifte Klammern wieder geschlossen)

*XOR nach Funktion* (es wird eine Entscheidung getroffen)
*AND, OR nach einem Ereignis*

eEPK Elemente:

Organisationselement (-> Funktion)
Daten (-> Funktion)
Prozesschnitstelle (-> Ereignis)





<!--stackedit_data:
eyJoaXN0b3J5IjpbMTM3NjY1MzYxNSwtOTEzNzg0Mzk5LC0xND
g1ODEzMzcyLC00MzYyMTQxMjYsMTYxMDAxODc3NywtMjI0MDE4
NDY1LC0zMjEwMjY3MjMsMTgwNDE3MDQxMiwtMTM1ODg3OTE5Ni
wxMzYzNjAyODk0LC05NDkxNzE4MjksMTA0Nzk4ODUzNywtODQ2
NDc1ODExLDIwNDYxNDc3MDYsMTc5NzIzMTYxMV19
-->