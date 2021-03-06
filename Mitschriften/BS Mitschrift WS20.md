# Betriebssysteme (9/1/20)
Ullrich Krause (ullrich.krause@gmx.net)

Andrew Tanenbaum - [Modern Operating Systems](http://lib.bvu.edu.vn/bitstream/TVDHBRVT/19439/1/Modern-Operatin-systems.pdf)

HSP: Hauptspeicher
Transaktion: Abarbeiten eines kompletten Betriebsvorfalls

CPU: Prozessor + Hauptspeicher

Betriebssystem:
- P1 (User)
- P2 (Service)
- P3 (analyise / Interrupt)
- P4 (Ausnahme / Error Handling)

IFR: Interrupt Flag register
IMR: Interrupt Mask Register

## Einführung (9/8/20)
Missing - see `fom/bs/wiederholungsfragen-einleitung`

## Einstieg (9/21/20)

Maziar Faschidnia (farschidnia@yahoo.de)

Analytical Engine (1792 - 1871)

Betriebssystem: Verwaltung von Systemresourcen (CPU, RAM, Disk)

Rechnersystem:
- Anwendungssoftware
- Systemsoftware
- Hardware

Aufgaben eines Betriebssystems:
- Orchstrierung der Hardware
- Abstraktion der Hardware
- Verwaltung von Betriebsmitteln

Betriebssysteme:
- Server
- PC
- Embedded
- Real-Time 

**Klausur:** Einen Thread mit Java programmieren, einen Prozess mit fork() erzeugen, virtuelle Speicherverwaltung, Shell

Speicherhierarchie: Register - RAM - Cache - Disk - Tape

**Klausur:** von-Neumann (Daten + Code zusammen), Harvard (Daten + Code getrennt)

## Processes & Threads (9/28/20)

Process: Code + Context

Process Table
Process Control Block

Exam: Priority + Nice, Zombie Processes

Parallele Prozesse: Konkurrenz / Kooperation

Exam: Threads, interrupt() vs stop()

## Prozessverwaltung (10/20/20)

(siehe Übungsaufgaben)

## Speicherverwaltung (11/9/20)

(siehe Übungsaufgaben)

## Ein-/Ausgabe (11/10/20)

(siehe Übungsaufgaben)

## Klausurvorbereitung (11/23/20)

(siehe Übungsaufgaben)

## Threads (11/24/20)

Scheduling-Strategien:
- Priorität
- Round Robin
- Shortest Job First / Shortest Processing Time

## Shell (12/1/20)

**Exam:** Swap, Paging, Memory - access, address translation *(Session 1, pg. 41 ff)*

**Exam:** Process VSS, RSS, wechselseitiger Ausschluss bzw. Kooperation *(Session 2, pg 10)*

<!--stackedit_data:
eyJoaXN0b3J5IjpbMTI1MTM0MzExNywtNjIzMzY2NTM2LC0xNT
IyNTQ1MjE5LC0xODMyMzY2NzI5LC0xOTQ3MjQzMzk1LDI5NTc0
MDY1MCwtMjA4MTU4NjU3N119
-->