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

## Rekursive Sortieralgorithmen (3/31/20)

*"Divide and Conquer"*

**Merge-Sort** - Sortiert beim Merge
-	Source-Array
-	Second-Array
-	3 Indizes

Aufwand (bei 8 Elementen): 8 Elemente pro Stufe, jede Stufe ist linear

T(n) = Aufwand pro Stufe * Anzahl Stufen
T(n) = (1 + n) &mult; (1 + log(n))

Komplexität: O(n log(n))

**Code:** `fom/ad/skript/code-vorlagen/heapsort.java`

**Quick-Sort** - Sortiert beim Teilen
- 2 Indizes
- Pivot-Element (Links, Rechts, Zufallig)

**Code:** `fom/ad/skript/code-vorlagen/quicksort.java`

Heap:
- Binärbaum mit der Wurzel als größtem Element
- Linkslastig

**Heap-Sort**:
- In level-order linkslastingen Binärbaum erzeugen (zeilenweiser Aufbau)
- Heap bilden
- Heap-Sort (Wurzel an das Ende verschieben)
- Das Resultat ist in level-order sortiert

Versickern: Durch den Tausch kann die Heap-Eigenschaft verletzt sein und kleinere Elemente müssen nach unten wandern

**Code:** `fom/ad/skript/code-vorlagen/heapsort.java`

Counting-Sort:
- Lineare(!) Laufzeit
- Zwei Arrays, ein Index
- Rahmenbedingungen:
	- Integer-Array mit Werten größer gleich Null
	- Bekanntes Maximum (für die Länge des zweiten (Counting) Arrays)

Komplexität: O(n + k)

**Code:** `fom/ad/skript/code-vorlagen/countingsort.java`

## Hashing (Key/Value) 4/7/20

Hashing: Eingabe beliebiger Länge, Ausgabe Identifikation fester Länge (Index, natürliche Zahl)
Datenbanken, Kryptographie, Prüfsumme

Ziel: Dictionary Operations (Suchen, Einfügen, Löschen) in konstanter Zeit durchführen

K: Key-Menge
A: Hash-Tabelle {0, 1, ... p-1}

h(k) = k mod p 
Falls k nicht numerisch, muss es umgewandelt werden, z.B. in den ASCII-Wert

Kongruenz Methode:
m (>IKI) als Primzahl und die Hash-Funktion als:
**h(k) = f(k) mod m** 
f(k) injektive Funktion für Keys &isin; K (eindeutige Zuordnung von K)

Kollision: Zwei Schlüssel werden auf die gleiche Position abgebildet.
Abschätzung: Bei einer Tabelle mit 365 Plätzen ist die Wahrscheinlichkeit einer Kollision ab 23 Elementen grösser als 50%

Chaining: Alle Elemente mit dem gleichen Hashwert werden in einer verketteten Liste gehalten.

Open Hashing: Suche eines alternativen Platzes

Linear: Bei K=h(s) belegt, (k+1) mod m, (k+2) mod m ...
Problem: Beim Löschen werden u.U. Suchketten unterbrochen

Quadratisch: Bei K=h(s) belegt, h(s)+1, h(s)+2^2^, ..., h(s)+i^2^

## Graphenalgorithmen (4/7/20)

Graphen: Allgemeine Graphen besitzen Knoten mit beliebig vielen Vorgängern und Nachfolgern, Zyklen sind möglich

G: (V,E) - endliche Menge aus Knoten (Vertices) und Kanten (Edges)

Kante von G: (v1, v2) - Adjacent, v1 Anfang, v2 Ende

Ungerichteter Graph, gerichteter Graph

Kanten und Knoten können Daten beinhalten

Einfacher Pfad: Pfad ohne Wiederholung

Zyklus: Einfacher Pfad, allerdings sind erster und letzter Knoten identisch

Graph ohne Zyklen wird Baum genannt
Graphen können zusammenhängen oder nicht
Eine Gruppe nicht-zusammenhängender Bäume wird Wald genannt

Spannbaum (Spanning Tree): Zyklenfreier, zusammenhängender Teilgraph mit den gleichen Knoten

Adjazenzmatrix: (Anzahl &mult; Anzahl) mit true: Kante existiert, false: Kante existiert nicht

Ineffizient bei Graphen mit einer großen Anzahl von Knoten und wenigen Kanten
Zugriff in konstanter Zeit: O(1)

Adjazenzliste: Eindimensionales Array verketteter Listen
Nur existierende Kanten werden abgespeichert.
Bestimmung von k Nachfolgern: O(k)

## Planare Graphen (4/24/20)

Ein Graph ist Planar, wenn er überschneidungsfrei gezeichnet werden kann

K<sub>2,2</sub> - 2 Kanten zu 2 Knoten -> Planar
K<sub>4</sub> - 4 Kanten zu 4 Knoten -> Planar

Ein planarer Graph darf keinen Teilgraphen K<sub>5</sub> oder K<sub>3,3</sub> enthalten!

*Farben: Jeder planarer Graph kann mit 4 Farben eingefärbt werden.*

Brückenproblem: Lösbar bei einer geraden Anzahl von Kanten
Rundreise: [Hamilton Kreis](https://mathepedia.de/Hamiltonkreisproblem.html)

**Travelling Salesman Problem** 

Bei 3 Stops gibt es bereits 3! Routen

Ungerichteter Graph: Symmetrisches Travelling Salesman Problem
Gerichteter Graph: Asymmetrisches Travelling Salesman Problem

NP-Vollständig: Es gibt keinen Algorithmus, der dieses Problem in polynomialer Zeit lösen kann.

[Simulated Annealing](https://mathworld.wolfram.com/SimulatedAnnealing.html):

Es wird eine Route gebildet und die Distanz ermittelt. Dann werden zwei Knoten zufällig ausgewählt und die Reihenfolge vertauscht: Ist die Distanz größer oder kleiner? Innerhalb eines Toleranzwertes &Sigma; werden auch Verschlechterungen akzeptiert.

**Graphen traversieren** (Tiefe / Breite)

Breitensuche: Zunächst alle Knoten in der Nähe erfassen, dann ausdehnen (Queue)
**Code:**  `fom/ad/skript/code-vorlagen/breitensuche.java`

Tiefensuche: Jeden Pfad bis zum Ende gehen und dann bis zur nächsten Abzweigung zurückgehen (Rekursion)

**Topologisches Sortieren**

Endlicher gerichteter Graph, mit ord(v1) < ord(v2)
Beispiel: Eine Vorlesung sei die Voraussetzung für eine andere. Gesucht: Zeitliche Anordnung der Vorlesungen
Quelle (Ausgang): Knoten ohne Vorgänger
**Code:**  `fom/ad/skript/code-vorlagen/topologischessortieren.java`


**Transitive Huelle** (Exkurs: a<b &and; b<c -> a<c)

Endlicher gerichteter Graph. Existierende Pfade durch mehrere Knoten hinweg werden um direkte Kanten ergänzt.
Die transitive Hülle enthält alle(!) Abkürzungen

[Floyd-Warshall Algorithmus](https://studyflix.de/informatik/floyd-warshall-algorithmus-1295)

## Graphenalgorithen (5/4/20)

Dijkstra Algorithmus - "Open shortest path first" (OSPF)

Ford-Fulkerson Algorithmus - Zunahmepfad

Huffmann-Codierung: 
- Präfix-freie Sprache
- Fano Bedingung
- Binärbaum mit Pfaden ohne Verwechslungsgefahr

## LZW Komprimierung (5/7/20)

LZW-Wörterbuch, urspruenglich 9-12 Bit, mittlerweile bis zu 16 Bit

Codierung: Füllen des Wörterbuches mit den ASCII-Zeichen (8 Bit)
Byte für Byte aufbauen, bei Match mit Nachfolger aufnehmen

Decodierung: Füllen wie oben, dann schrittweise mit Vorgänger aufbauen

Knuth-Morris-Pratt Algorithmus (Pattern Matching)

Rand: Präfix und Suffix eine Teilworts (Beispiel: KOKOS: KOK - Rand 1; KOKO - Rand 2)

Komplexität: O(n+m) - zum Vergleich, lineares (naives) Pattern Matching: O(n &times; m)

i = Index Pattern; j = Index Suchwort
Verschiebung: Delta s = j - rand 
Neuer Index j = rand





<!--stackedit_data:
eyJoaXN0b3J5IjpbMTQ1NzE4NCwtMTYxMjk5ODg4OCw1ODQzMz
kzMCwxNzc5MjMyNTA1LDMzMDgzNzQzNywtMTQ1NzgzOTg5OSw3
ODQ1MTQwNDUsODQ1MzMxOTc0LDgyNTc5Nzk3NiwxMTE2MTExMD
I5LDEwODU3OTAwMDMsLTEwNDYzOTk2MjQsLTE1OTkyMjgxNzUs
MTE1ODk0MzUxMV19
-->