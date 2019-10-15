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


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE0MjI5NTM4OTgsLTYxNTg0NjMzNCwxMD
g5NTc2OTI1LC04OTAxOTk4ODEsNzMwOTk4MTE2XX0=
-->