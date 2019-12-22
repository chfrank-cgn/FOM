# IT Infrastruktur WS19 (9/2/19)

Frank R. Becker
info@frank-r-becker.de

Note: 50% Klausur (60', **11/4/19**), 50% Seminararbeit (Abgabe: **12/29/19**)

Thema: Multi-Cluster Management für Containerumgebungen ([Vorlage](https://www.overleaf.com/latex/templates/latex-vorlage-einer-semiararbeit/vxfrnfczdvnq))
Ca. 4000 Worte, Praxisbezug 25% (~1000 Worte). Minimalanforderung: Kein Plagiat, saubere Arbeit

Gliederung:
- Einleitung / Motivation
- Problemstellung
- Fachwissen / Recherche
- Modell
- Praxisbezug (s.o.)
- Schluss / Zusammenfassung / Ausblick



[DIN EN 50600](https://www.din.de/de/mitwirken/normenausschuesse/dke/normen/wdc-beuth:din21:306267564) - Informationstechnik - Einrichtungen und Infrastrukturen von Rechenzentren
[ISO 27001](https://www.iso.org/isoiec-27001-information-security.html) - Information Security Management

## Software (9/3/19)

- Firmware
- Software
- Monitoring / Logging

Elektroverteilung

Personenschutz

Notstrom (besser: *Netz-Ersatz-Strom*)

[Power Usage Effectiveness](https://www.42u.com/measurement/pue-dcie.htm) (PUE) 
PUE = Total Facility / IT Equipment

HVAC: Heating, Ventilation, Air Conditioning

Temperatur: Zwischen 10 und 26 Grad (laut Hersteller)
Luftfeuchtigkeit: Zwischen 40% und 60% (laut Hersteller)

Brandschutz
*Sauerstoffgehalt unter 18% - kein Brand*

## Brandschutz (9/10/19)

- Prävention
- Entdeckung
- Bekämpfung

In der IT: *Ein Brand bedeutet Datenverlust*

Zugang:
- Zutritt
- Zugriff

Zwei-Faktor Authentifizierung: "Besitzen" und "Wissen" (Token und Passwort)

Netzwerke: BAN, PAN, LAN, MAN, WLAN, GAN (alt)

## Netzwerke (9/16/19)

Vortrag    `projekte/fom/it/vortrag 2019-09-16`

## Seminararbeit (10/1/19)

Seminararbeit: [Deskriptive Studie](https://de.wikipedia.org/wiki/Deskriptive_Studie)

Anforderung an die Hypothese:
- Empirisch überprübar
- Falsifizierbar
- Hinreichend informativ
- Logischer Aufbau
- Präzise
- Eindeutig

**Gliederung:**
- Einleitung
	- Problemstellung
		- Allgemein -> Speziell (*Hypothese*)
	- Zielsetzung
		- Oberziele
		- Unterziele
		- Methodik
		- Umfang der Arbeit / Abgrenzung
- Begrifflichkeiten
	- Definition
	- Verständnis
- Theorie
	- Modell beschreiben
	- Modell vergleichen
	- Festlegung auf ein Modell / Methode, Begründung
- Transfer (Praxisbezug)
	- Ist-Zustand im Anwendungsfall
	- Soll-Ist Vergleich
	- Handlungsempfehlung
		- Massnahmen (Ist): Umsetzung
- Fazit
	- (Top 5) Erkenntnisse
	- Kritik am eigenen Vorgehen
	- Ggf. Fragen oder Ausblicl

Umfang 4000 Worte
- 2500 Einleitung - Theorie
- 1000 Transfer
- 500 Fazit

**Klausur:** Cluster-Modelle (A/A, A/P), Vorteile, Nachteile, Konzepte

Verfügbarkeit:    A<sub>gesamt</sub> = 1 - W<sub>ausfall</sub> = 1 - Ausfallzeit &divide; Gesamtlaufzeit

Verteilte Systeme: A<sub>gesamt</sub> = A<sub>1</sub> &times; A<sub>2</sub> ... &times; A<sub>n</sub> = &prod; A<sub>i</sub>

Redundante Systeme: A<sub>gesamt</sub> = 1 - &prod; (1 - A<sub>i</sub>)

MTBF: Mean Time Between Failure
MTTR: Mean Time to Repair / Recover

A = MTBF &divide; (MTBF + MTTR)

BCM: Business Continuity Management
BIA: Business Impact Analysis

## Datentypen (10/15/19)

**Klausur:**
- IT Szenarien
	- HPC (High-Performance Computing)
	- Verfügbarkeit
- Formel Verfügbarkeit verteilter Systems
- PUE (Power Usage Efficiency)
- Dunkelgrün / Fett gedruckt

## Klausurvorbereitung (10/21/19)

- DIN EN 50600
- ISO 27001 auf der Basis von IT Grundschutz
- Hardware / Software, Beispiele
- **Kabelführungen, Kabellängen,  Absicherung, Anzahl Adern**
- USV: Shutdown, Überbrückung bis Notstrom (Netzersatzstrom) einsetzt; USV vs Notstrom
- PUE = Total Facility &divide; IT Equipment
- RZ: Einhausung, Kaltgang / Warmgang
- Brandschutz
	- Prävention
	- Entdeckung
	- Bekämpfung
- Brand: Brennstoff - Sauerstoff - Hitze
- Zugangsschutz
	- Unberechtigten Zutritt verhindern
	- Im Notfall Flucht ermöglichen
	- Zutritt für Rettungskräfte
- ITU, IEEE, IETF, W3C
- **Klassifikationskriterien**
- Öffentliche Netze vs private Netze
- LAN / WAN, MAN
- Netztopologien: Stern, Baum, Bus, Zellen, Maschen
- OSI Model (Layer 1 - 7)
- Kabel: BNC, Twisted Pair, Fiber
- Komponenten: Repeater, Bridge, Hub, Switch, Router, Firewall
- Ethernet: **Diffusions Netz**, CSMA/CD
- Scale-Out (Horizontal), Scale-Up (Vertical)
- Cluster, **HA** (ab 99.99%), Load balancing, **HPC**
	- Besonderheiten Stromversorgung, Netzwerke, Rechnertypen
- Formeln für mehrere Systeme bzw. redundante Systeme
- MTBF, MTTR
- Betrieb: Eigenbetrieb "on-premise", Cloud, Hosting
- Virtualisierung
- IaaS, PaaS, SaaS, FaaS ("self-service")
- RAID: Redundant Array of Independent Disks
	- Striping, mirroring, error correction code
	- Hot swap / Hot spare
	- RAID Level 0, 1, 5, 1-0, 0-1
- Backup / Restore / Archivierung
	- Komplettsicherung / Differenzsicherung / Inkrementelle Sicherung
	- Generationen
- Thin client / Fat client / Terminal Server / Windows Virtual Desktop


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTQwNTUzNDE4NSwtMTM1NTAxMzQxNywtMT
QyMjk1Mzg5OCwtNjE1ODQ2MzM0LDEwODk1NzY5MjUsLTg5MDE5
OTg4MSw3MzA5OTgxMTZdfQ==
-->