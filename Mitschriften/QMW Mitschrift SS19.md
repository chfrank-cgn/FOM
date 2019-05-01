#  Quantitative Methoden der WI (3/5/19)

[Liste der mathematischen Symbole](https://de.wikipedia.org/wiki/Liste_mathematischer_Symbole)
[Liste der griechischen Buchstaben](http://www.millin.de/downloads/3-935922-52-3/src/sonderzeichgriech.htm)

## Statistik

### Kapitel 1

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

### Kapitel 2

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

### Kapitel 3

fehlt

### Kapitel 4 (3/12/19)

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

### Kapitel 5 (3/19/19)

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

### Kapitel 6 - nicht Klausurrelevant

### Kapitel 7 (4/8/19)

Parameterschätzung

7.1 Punktschätzung

7.1.1 Punktschätzung über einen Mittelwert &mu;

Normalverteilte Grundgesamtheit X ~ N(&mu;,&sigma;^2^)
Zufällige Stichprobe x1, x2, ... , xn

&mu;-Schätzwert x = &sum; xi &div; n = (x1 + x2 + ... + xn) &div; n

7.1.2 Schätzwert für unbekannte Standardabweichung

S = &radic; &sum;(xi-$\bar x$)^2^ &div; (n-1) = &radic; (&sum;xi^2^ - n &times; $\bar x$^2^) &div; (n-1)

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

### Kapitel 8 (4/15/19)

Hypothesentest: H0 - Nullhypothese, H1 - Alternativhypothese
Signifikanzniveau &alpha;

Testgrösse TS = ($\bar x$ - &mu;) &div; &sigma; &div; &radic;n

Verwerfungsbereich W &isin; [-&infin;, -\<Z&alpha;/2\>] &cup; [\<Z&alpha;/2\>, &infin;]

Liegt die Testgrösse im Verwerfungsbereich, so wird H0 verworfen

**8.3 Hypothesentest mit &mu;0 und &sigma; unbekannt**

Normalverteilung  X ~ N(&mu0;,&sigma;^2^)

H0: &mu; = &mu;0
H1: &mu; &ne; &mu;0

Testgrösse TS = = ($\bar x$ - &mu;0) &div; S &div; &radic;n
(S : Schätzwert für die unbekannte Standardabweichung, siehe oben)

Kritischer Wert für die Verwerfung von &mu;0 : t&alpha;/2,n-1 (aus t-Tabelle)

Verwerfungsbereich W &isin; [-&infin;, -\<t&alpha;/2,n-1\>] &cup; [\<t&alpha;/2,n-1\>, &infin;]

### Kapitel 9 - nicht Klausurrelevant (4/23/19)

### Kapitel 10

10.1 Lineare Korrelation

x und y sind unabhängige Variablen, die in einer Stichprobe als Wertepaare (Tupel) mit der Anzahl n vorliegen

Der Korrelationskoeffizient r nimmt Werte von -1 &le; r &le; 1 an
Ist r = 0, so liegt keine Korrelation vor
Ist $\vert r \vert$ = 1, soliegt eine vollständige Korrelation vor

r = (&sum;(xi &times; yi) - n &times; $\bar x$ &times; $\bar y$) &div; ((&radic; &sum;(xi^2^) -n &times; $\bar x$^2^) &times; (&radic; &sum;(yi^2^) -n &times; $\bar y$^2^))

*"aufsummierte quadrierte Differenz"*

10.2 [Lineare Regression](https://www.uni-due.de/imperia/md/content/soziologie/13_lineare_regression2.pdf)

Wertepaare wie oben, Fragestellung ist ob sich eine Gerade finden lässt, die diese Werte repräsentiert.

Gesucht ist die Gerade: ŷ = &alpha; + &beta; &times; x (mit &alpha;: Anfangsordinate, &beta;: Steigung)

Methode der kleinsten Quadrate:

&beta; = (&sum;(xi &times; yi) - (n &times; $\bar x$ &times; $\bar y$)) &div; ((&sum;(xi^2^) - (n &times; $\bar x$^2^))

&alpha; = $\bar y$ - (&beta; &times; $\bar x$)

10.3 Signfikanztest einer linearen Korrelation

Wertepaare liegen wir oben vor, der lineare Korrelationskoeffizient r ist bekannt
Es ist sinnvoll, ein lineares Regressionsmodel mit folgenden Hypothesen auf einem &alpha; Signifikanzniveau zu testen:

H0 : &beta; = 0 (Die Steigung der Regressionsgerade ist gleich Null, d.h. das Regressionsmodell ist nicht signifikant)
H1 : &beta; &ne; 0 (Die Steigung der Regressionsgerade ist nicht gleich Null)

Testgrösse TS: (r &times; &radic; (n - 2)) &div; (&radic;(1 - r^2^))

Kritischer Wert: t&alpha;/2,n-2 *(aus t-Tabelle)*

Verwerfungsbereich W &isin; [-&infin;, -\<t&alpha;/2,n-2\>] &cup; [\<t&alpha;/2,n-2\>, &infin;]

Ist das Ergebnis im Verwerfungsbereich, so ist das Regressionsmodell für ŷ anwendbar

## Numerik

### Kapitel 3 (4/30/19)

Numerische Lösung nichtlinearer Gleichungen
y = f(x) sei eine nichtlineare Funktion; sie sei monoton im Definitionsbereich [a, b]. 
Wenn die Bedingung f(a) &times; f(b) = 0 erfüllt wird, existiert eine Nullstelle im Bereich [a, b].

3.1 Fixpunktverfahren
- wir wandeln die Funktionsgleichung f(x) in eine Iterationsvorschrift &phi;(x) um (durch Ausklammern von x),
- wir wählen einen Anfangswert x0 aus [a,b] und
- bestimmen eine kleine Zahl &epsilon; als Abbruchwert für $\vert$ xk+i - xk $\vert$ &lt; &epsilon;

Beispiel:

f(x) = x^2^ - 2 &times; x - 0.15 ; Nullstelle zwischen [-1,0], &epsilon; = 10^-5^, Anfangswert x0 = 0.00000
Iterationsvorschrift: xk+i = (xk^2^ - 0.15) &div; 2 (= &phi(x))

    float x0, x1, epsilon, residual;
    x0 = 0.0; x1 = 0.0; epsilon = 0.000005; residual = 0.0;
    int k = 0;

Und berechnen die Nullstelle mit

    do {
    	x0 = x1;
    	x1 = ((x0 * x0) -  0.15) /  2;
    	residual =  fabs(x0 - x1);
    	k++;
    	printf("%i\t%.5f\t%.5f\t%.5f\n",k,x0,x1,residual);
    } while (fabs(residual) > epsilon);

Ergebnis:

    k	X0			X1			Residuum
    1	0.00000		-0.07500	0.07500
    2	-0.07500	-0.07219	0.00281
    3	-0.07219	-0.07239	0.00021
    4	-0.07239	-0.07238	0.00001
    5	-0.07238	-0.07238	0.00000

3.2 Newton-Verfahren

Beispiel wie oben, schneller konvergierende Iterationsvorschrift nach Isaac Newton:

xk+1 = xk - (f(xk) &div; f^'^(xk))

Berechnung der Nullstelle:

    do {
    	x0 = x1;
    	x1 = x0 - (((x0 * x0) - (2  * x0) -  0.15) / ((2  * x0) -  2));
    	residual =  fabs(x0 - x1);
    	k++;
    	printf("%i\t%.5f\t%.5f\t%.5f\n",k,x0,x1,residual);
    } while (fabs(residual) > epsilon);

Ergebnis:

    k	X0			X1			Residuum
    1	0.00000		-0.07500	0.07500
    2	-0.07500	-0.07238	0.00262
    3	-0.07238	-0.07238	0.00000

### Kapitel 4 (5/13/19)

4.1 [Polynominalinterpolation](https://www.youtube.com/watch?v=BJc0bQNRSo4)

4.2 [Newton Interpolation](https://www.youtube.com/watch?v=hcsBjizQ9X8)

Deutsch: [https://www.youtube.com/watch?v=p0W0JB6NXm8](https://www.youtube.com/watch?v=p0W0JB6NXm8)

### Kapitel 5 (5/13/19)

5.1 [Ausgleichrechnung](https://www.youtube.com/watch?v=21axnsC_2ZE)

<!--stackedit_data:
eyJoaXN0b3J5IjpbMTUzNjc2OTM0Nyw0ODU3NDUzNDksMjk5Mj
MxOTI2LC02ODEzMzg4MTQsMTQ4MTEwMTk5NSw4MTAyODAxNjcs
MTYwNTUwODEyMiw1ODkzOTQyMzYsLTE3MTQ4NzU5NywtMTg3MD
czMDA2NCwxMjE5OTE1ODY5LDIxODk4Mzc3MSwxNzU4NzczNDMz
LDE5OTE4Mjk4NjAsODM3MDQ5ODAwLC0yMTQ2MzI4MDU3LC0xMD
YyNzMwMjAsLTc2NjY5MjExMywtODg5NTE3ODI5LC01MzA5MTA5
NjVdfQ==
-->