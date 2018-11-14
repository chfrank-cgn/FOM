
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


<!--stackedit_data:
eyJoaXN0b3J5IjpbMTYwMDM5MTIzNiwtMzIxMDI2NzIzLDE4MD
QxNzA0MTIsLTEzNTg4NzkxOTYsMTM2MzYwMjg5NCwtOTQ5MTcx
ODI5LDEwNDc5ODg1MzcsLTg0NjQ3NTgxMSwyMDQ2MTQ3NzA2LD
E3OTcyMzE2MTFdfQ==
-->