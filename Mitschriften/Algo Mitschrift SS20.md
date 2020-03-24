# Algorithmen und Datenstrukturen (3/2/20)

Prof. Dr. Oliver Lazar - oliver.lazar@fom.de - [nerdwest.de](http://www.nerdwest.de/home.php)

Algorithmus: Handlungsvorschrift zur Lösung einer bestimmten Art von Problemen in endlicher Zeit

Verfahren
- Endliche Länge
- Termination
- Determinismus (-> Schritte)
- Determiniertheit (-> Ergebnis)
- Sequentialität / Parallelität

Rekursion:
- Rückführung von n auf das Problem n-1

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

Pascalsches Dreieck - Binomialkoeffizient

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

## AVL Bäume (3/24/20)

[AVL Tree](https://www.geeksforgeeks.org/avl-tree-set-1-insertion/) is a self-balancing Binary Search Tree, invented 1962 by: Georgy Adelson-Velsky and Evgenii Landis

Balance: Gleiche Tiefe - [Visualization](https://www.cs.usfca.edu/~galles/visualization/AVLtree.html)

Jeder Knoten hat einen Balance-Wert:
- 0 Blatt
- Negativ: Links Übergewicht
- Positiv: Rechts Übergewicht

Bei einem Balance-Wert von +2 oder -2 wird rotiert
Bei gleichem Vorzeichen: Einfache Links-Rotation
Bei Vorzeichenwechsel: Doppelte Rotation, erst rechts, dann links, eventuell mit Übertrag

AVL Sort hat eine linear-logarithmische Laufzeit

## Zeitkomplexität / Groß-O Notation (3/24/20)

n - number of elements / steps

O(1) = Konstante Laufzeit
O(n) = Lineare Laufzeit (Array-Durchlauf)
O(n^2^) = Quadratische Laufzeit (Bubble-Sort)
O(n^3^), O(n^4^) = Polynomielle Laufzeit
O(n + log(n)) = Linear-logarithmische Laufzeit (Quicksort, Merge-Sort, AVL Sort)
O(2^n^) = Exponentielle Laufzeit (Travelling Salesman)

Bubble Sort: Iteratives Verfahren, quadratische Laufzeit, ok bis ca. 1000 Elemente

**Code:** `fom/ad/skript/code-vorlagen/bubblesort.java`

<!--stackedit_data:
eyJoaXN0b3J5IjpbODI1Nzk3OTc2LDExMTYxMTEwMjksMTA4NT
c5MDAwMywtMTA0NjM5OTYyNCwtMTU5OTIyODE3NSwxMTU4OTQz
NTExXX0=
-->