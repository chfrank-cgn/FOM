#  Quantitative Methoden der WI (3/5/19)

[Liste der mathematischen Symbole](https://de.wikipedia.org/wiki/Liste_mathematischer_Symbole)
[Liste der griechischen Buchstaben](http://www.millin.de/downloads/3-935922-52-3/src/sonderzeichgriech.htm)

Statistik
- Deskriptive Statistik
- Induktive Statistik

Einführung
- &sum; Summe (Sigma) von i=1 bis n
- &prod; Produkt (Pi) von i=1 bis n

Begriffe
- Statistische Einheiten (Elemente)
- Statistische Grundgesamtheit (Menge)
- Statistische Variable (Qualitativ / Quantitativ)

Erhebung und Präsentation
- Diskret: 1,2,5
- Stetig: 7 - 15

Klassifizierung von Daten
- Anzahl der Klassen K
- Klassenbreite d = Xmax - Xmin / K

*Regel: Zuordnung der Daten linkbündig, d.h. am Anfang*

Masszahlen für die zentrale Lage
- Arithmetischer Mittelwert
- Geometrischer Mittelwert
- Harmonischer Mittelwert
- Median

Der Median teilt eine sortierte Datenmenge in der Mitte. Anders als die Mittelwerte wird der Median nicht durch Randwerte beeinflusst.

Modus: Der Wert mit der grössten Häufigkeit

**Klausurhinweis:** 
- Immer Einheiten aufschreiben!
- Immer Formel aufschreiben und Lösungsweg herleiten!


## Kapitel 4 (3/12/19)

4.1 fehlt

4.2 Additionsregel

P(A&cup;B) = P(A) + P(B) - P(A&cap;B)

4.3 Bedingte Wahrscheinlichkeit - *"A tritt ein, wenn B eingetreten war"*

P(A|B) = P(A&cup;B) &divide; P(B)

4.4 Multiplikationsregel

P(A&cap;B) = P(A) &times; P(B)

4.5 Totale Wahrscheinlichkeit

E seien disjunkte Ereignisse in &Omega; ; A ein weiteres Ereignis

P(A) = P(E1) &times; P(A|E1) + P(E2) &times; P(A|E2) + ... + P(En) &times; P(A|En)

**Klausur:** 
- Nur Textaufgaben
- Formeln aufschreiben
- Rechenweg herleiten

[**Bayes Theorem**](https://en.wikipedia.org/wiki/Bayes%27_theorem)

> In probability theory and statistics, Bayes' theorem (alternatively
> Bayes' law or Bayes' rule) describes the probability of an event,
> based on prior knowledge of conditions that might be related to the
> event. For example, if cancer is related to age, then, using Bayes'
> theorem, a person's age can be used to more accurately assess the
> probability that they have cancer, compared to the assessment of the
> probability of cancer made without knowledge of the person's age.

P(E1|A) = P(E1) &times; P(A|E1) &divide; P(A)

**Klausur:** Aufgabe Seite 12 zu 4.3, Aufgabe Seite 13 zu 4.5

## Kapitel 5 (3/19/19)

Zufallsvariable
Beispiel: Münzen werfen (Head/Tails)

&Omega; = { (T,T), (T,H), (H,T), (H,H) }
X: Zufallsvariable "Head", X = 0, 1, 2

P(X=0) = 0.25
P(X=1) = 0.5
P(X=2) = 0.25

&sum; P(X) = 1

Erwartungswert:

E(X) = X1 &times; P(X1) + X2 &times; P(X2) + ... + Xn &times P(Xn)

5.1 Binominale Zufallsvariable
Die Ausgänge lassen sich in zwei Kategorien klassifizieren: Erfolg / Misserfolg

Bernoulli Experiment: Zufallsexperiment mit zwei Ausgängen

Parameter:
n : Anzahl der Versuche
P : Wahrscheinlichkeit für den Erfolg bei einem Versuch (= jedem Versuch)
x : Anzahl der Erfolge

P(x) = C(n,x) &times; P^x^ &times; (1-P)^n-x^ = (n! &divide; x! &times; (n-x)!) &times; P^x^ &times; (1-P)^n-x^

Beispiel: 10 Würfe einer Münze - wie hoch ist die Wahrscheinlichkeit, dass 5 mal Kopf auftritt?
n = 10; P = 0.5; x = 5;

P(5) = (10! &divide; 5! &times; (10 - 5)!) &times; 0.5^5^ &times; (1 - 0.5)^10-5^ = 0.246

5.2 Hypergeometrische Zufallsvariable
Menge mit N Elementen, M davon haben das Merkmal
Stichprobe mit n Elementen ("ziehen ohne zurücklegen")
x Elemente in der Stichprobe haben das Merkmal

x : Hypergeometrische Zufallsvariable

           (N-M)(M)
           (n-x)(x)
    P(x) = --------
             (N)
             (n)

[**Binomialkoeffizient**](https://de.wikipedia.org/wiki/Binomialkoeffizient) 

> Der Binomialkoeffizient ist eine mathematische Funktion, mit der sich
> eine der Grundaufgaben der Kombinatorik lösen lässt. Er gibt an, auf
> wie viele verschiedene Arten man k Objekte aus einer Menge von  n
> verschiedenen Objekten auswählen kann (ohne Zurücklegen, ohne
> Beachtung der Reihenfolge). Der Binomialkoeffizient ist also die
> Anzahl der k-elementigen Teilmengen einer n-elementigen Menge. Die
> englische Abkürzung **nCr** für `n choose r` findet sich als
> Beschriftung auf Taschenrechnern.

5.3 Normale Zufallsvariable (Normalverteilung)
Es sei &mu; der Mittelwert, &sigma; die Standardabweichung.

Eine Normalverteilung hat folgende Eigenschaften:
- 68% der Werte im Bereich [&mu;-&sigma; , &mu;+&sigma;]
- 95% der Werte im Bereich [&mu;-2&sigma; , &mu;+2&sigma;]
- 99% der Werte im Bereich [&mu;-3&sigma; , &mu;+3&sigma;]

**Standardisierung**
Eine Normalverteilung in der Standardform hat &mu;=0 und &sigma;=1

Z ~ N(0, 1^2^)

Beliebige Normalverteilung:

X ~ N(&mu;,&sigma;^2^)

Umwandlung X zu Z:

Z = (X-&mu;) &divide; &sigma;

Beispiel:
Die Noten in einer Klausur sind normalverteilt, mit &mu;=70 und &sigma;=5

Q: Qie groß ist die Wahrscheinlichkeit, daß eine zufällig ausgewählte Note kleiner 78 ist?

A: Sei X die normalverteilte Zufallsvariable, gesucht ist

P(X < 78) = P(Z < (78-&mu;)&divide;&sigma;) = P(Z < 78-70&divide;5) = P(Z < 1.6) = 0.9452 **(aus Z-Tabelle)**

## Kapitel 6 - nicht klausurrelevant

## Kapitel 7 (4/8/19)

Parameterschätzung

7.1 Punktschätzung

7.1.1 Punktschätzung über einen Mittelwert &mu;

Normalverteilte Grundgesamtheit X ~ N(&mu;,&sigma;^2^)
Zufällige Stichprobe x1, x2, ... , xn

&mu;-Schätzwert x = &sum; xi &div; n = (x1 + x2 + ... + xn) &div; n

7.1.2 Schätzwert für unbekannte Standardabweichung

S = &radic; &sum;(xi-x)^2^ &div; (n-1) = &radic; (&sum;xi^2^ - n &times; x^2^) &div; (n-1)

7.2 Intervallschätzung

Fall 1) &mu; ist unbekannt - &sigma; ist bekannt
Fall 2) &mu; ist unbekannt - & sigma; ist ebenfalls unbekannt

Gesucht: Wertebereich in dem sich &mu; mit grosser (>95%) Wahrscheinlichkeit befindet (&alpha=0.05)

1) Gegeben sei X ~ N(&mu;,&sigma;^2^); &mu; unbekannt; &sigma; bekannt
Schätzwert x wie oben - der Wert ist stochastisch, d.h. durch die Stichprobe bestimmt

Konfidenzintervall: x - Z&alpha;/2 + &sigma; &div; &radic; n < &mu; < x + Z&alpha;/2 + &sigma; &div; &radic; n

**Exkurs:** Z : Normalverteilung in der Standardform (Z-Tabelle)

P(Z < Z&alpha) = 1 - &alpha;

2) Gegeben sei X ~ N(&mu;,&sigma;^2^); &mu; unbekannt; &sigma; unbekannt
 
**Exkurs:** t-Tabelle: df - degrees of freedom (Freiheitsgrade)

x - t(&alpha;/2,n-1) &times; S &div; &radic; n < &mu; < x + t(&alpha;/2,n-1) &times; S &div; &radic; n

## Kapitel 8 (4/16/19)

Hypothesentest: H0 - Nullhypothese, H1 - Alternativhypothese







<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE4NzA3MzAwNjQsMTIxOTkxNTg2OSwyMT
g5ODM3NzEsMTc1ODc3MzQzMywxOTkxODI5ODYwLDgzNzA0OTgw
MCwtMjE0NjMyODA1NywtMTA2MjczMDIwLC03NjY2OTIxMTMsLT
g4OTUxNzgyOSwtNTMwOTEwOTY1LC0zMDgzMjEwMDQsMTkzOTAw
NTc1Myw3MzA5OTgxMTZdfQ==
-->