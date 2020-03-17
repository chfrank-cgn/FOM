# Algorithmen und Datenstrukturen (3/2/20)

Prof. Dr. Oliver Lazar - oliver.lazar@fom.de - [nerdwest.de](http://www.nerdwest.de/home.php)

Algorithmus: Handlungsvorschrift zur Lösung einer bestimmten Art von Problemen in endlicher Zeit

Verfahren
- endliche Länge
- Termination
- Determinismus (-> Schritte)
- Determininiertheit (-> Ergebnis)
- Sequentalität / Parallelität

Rekursion:
- Rueckführung von n auf das Problem n-1

Direkte Rekursion / Indirekte Rekursion

Stack: LIFO (Last In / First Out)

Fibonacci:
- F(0)=0
- F(1)=1
- F(n) = F(n-1) + F(n-2)

Endrekursion: Speicherung des Zwischenergebnisses als Übergabeparameter 
`fom/ad/skript/code-vorlagen/fakultaetendrekursiv.java`

Binäre Suche "mehrstufige Intervallhalbierung"
- Sortiertes Array
- Logarithmische Laufzeit

**Exam:** Türme von Hanoi - Beweis durch vollständige Induktion

Backtracking: Trial & Error
- Labyrinth
- 8-Damen Problem
- Travelling Salesman

Pascal'sches Dreieck - Binominal Koeffizient

**Exam:** Lazar'sches Quadrat

## Datenstrukturen (3/16/20)

Lineare Datenstruktur: 1 Vorgänger, 1 Nachfolger

Array: Statische Datenstruktur
Zugriff auf ein Element bei bekanntem Index in konstanter Zeit

Liste: Dynamische Datenstruktur
Zugriff auf ein Element über eine schrittweise Suche

    class Element {
    	char val;
    	Element next:
    }
    first = new(Element);

**Code:** `fom/ad/skript/code-vorlagen/einfacheliste.java`

Stack: LIFO - push() / pop()
Queue: FIFO enqueue() / dequeue()

**Code:** `fom/ad/skript/code-vorlagen/queuetest.java`

Nicht-lineare Datenstrukturen: Bäume, Graphen

Wurzel - Vater - Sohn - Blatt

Binärbaum: Jeder Vater hat höchstens zwei Söhne (vollständig: genau zwei Söhne)

Baum: Rekursive Datenstruktur

    class Node {
    	int val;
    	Node left;
    	Node right;
    }

Geordnete Bäume: Suchbäume 
links < wurzel < rechts

Traversal (Ausgabe bei W): `fom/ad/traversal.jpg`
- In-order: unten, LWR (in sortierter Reihenfolge)
- Pre-order: links, WLR (Suchbaum)
- Post-order: rechts, LRW (compiler)
- Level-order: Zeilenweise von oben nach unten (Heap Sort)


<!--stackedit_data:
eyJoaXN0b3J5IjpbMTExNjExMTAyOSwxMDg1NzkwMDAzLC0xMD
Q2Mzk5NjI0LC0xNTk5MjI4MTc1LDExNTg5NDM1MTFdfQ==
-->