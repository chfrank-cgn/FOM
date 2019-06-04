
# Objektorientierte Programmierung SS 19 (3/5/19)

Salah Zayak

UML Diagramme
 - Use-Case Diagramme
 - Klassendiagramme
 
 Use-Case Diagramme
 - Systemgrenzen
 - Akteure
 - Use Cases
 - include
 - extend
 
 Klassendiagramme
 - Name
 - Attribute (Variablen)
 - Methoden (Funktionen)

Klassenattribute werden unterstrichen, Instanzattribute nicht

Assoziationen zwischen Klassen
- Bidirektional
- Gerichtet
- Multiplizierend (50 Personen in einem Restaurant)

Aggregation - Unabhängig (Stuhl - Restaurant)
Komposition - Abhängig (Ast - Baum)

## Gute Software (3/11/19)
 
 Gute Software
 - Korrekt
 - Benutzerfreundlich
 - Effizient
 - Wartbar
 
 3-Schicht Modell 

Java API: Oracle docs

    javadoc -author -version
    

## microXchg (4/1/19)

  **Klausur:**
- Klassen und Objekte  
- Use Case und Klassendiagramme (alle Eigenschaften)  
- Übersetzug von Code nach Klassendiagramm und umgekehrt  
- Richtiges und sinnvolles Kommentieren von Code  
- Primitive und Komplexe Datentypen (Insbesondere Unterschiede)  
- Alle Variablentypen (Klassen-, Instanz-, lokale Variable und die jeweilige Visibility)  
- Arrays  
- String und StringBuffer  
- Garbage Collector und Referenzen

Hausaufgabe: 03-03, 03-04

## Kontrollstrukturen (4/29/19)

String: fest
StringBuffer: veränderlich
Array of String: String[] enea = new String[];

for-each construct, execute once for each element of the array:

    for (\<type\> \<variable\> :  \<array\>) { ... }

*this: Pointer to self (instance variable)*

Function calls:
- Simple data types: call-by-value
- Classes: call-by-reference

Overload of functions:
- `String.substring(int beginIndex)`
- `String.substring(int beginIndex, int endIndex)`
(distinction through signature: method+parameter list)

Information Hiding
- set class variable `private`
- introduce get/set methods

Class variables defined as `public static` are valid in all instances!

Convention: Set instance variables `private`

A constructor has always the same name as the class, it's purpose is initialization

Homework: 04-04, 06-05, 06-06

## Inheritance (5/14/19)

[UML Class diagrams](https://www.codingame.com/playgrounds/503/design-patterns/uml-basics) - [arrow types](https://en.wikipedia.org/wiki/Class_diagram#/media/File:Uml_class_relation_arrows_en.svg.png):
- Association
- Inheritance
- Aggregation
- Composition
- (Realization / Implementation)
- (Dependency)

Constructor:
- in class: this() ; this.\<var\>
- extends: super() ; super.\<var\>

Klausur:
- UML zu Code
- Code zu UML
- Code vervollständigen
- Java Konzepte erklären (Freitext)

Homework: 08-04, 08-05

## Exception Handling (5/21/19)

Homework: 10-02, 10-03

## ORM / JAR / GUI (6/3/19)

Extrasession: Dienstag, 18. Juni, 15:00 Telekom Sternengasse

**Klausurrelevant:** Bis Kapitel 12 "Code", Kapitel 13 "Konzepte", Kapitel 14 nicht, Kapitel 15 "Konzepte"

Homework: Kapitel 12, 13-01, 13-02

Java Applet: A Java applet was a small application written in the Java programming language, or another programming language that compiles to Java bytecode, and delivered to users in the form of Java bytecode. The user launched the Java applet from a web page, and the applet was then executed within a Java virtual machine (JVM) in a process separate from the web browser itself. A Java applet could appear in a frame of the web page, a new application window, Sun's AppletViewer, or a stand-alone tool for testing applets ([Wikipedia](https://en.wikipedia.org/wiki/Java_applet))

Configuration persistence: [Properties()](https://www.geeksforgeeks.org/java-util-properties-class-java/) class in `java.util.*`

FileStreams: [FileInputStream()](https://www.geeksforgeeks.org/java-io-fileinputstream-class-java/), [FileOutputStream()](https://www.geeksforgeeks.org/creating-a-file-using-fileoutputstream/) in `java.io.*`

Object Relational Mapping (ORM): Persistenz von Klassen in Datenbanken
Framework: [Hibernate](https://hibernate.org/orm/what-is-an-orm/) - Mapping zwischen Klassen und Tabellen mit Hilfe von XML Dateien

GUI Programmierung in Java mit [Swing](https://www.javatpoint.com/java-swing) und [AWT](https://www.javatpoint.com/java-awt) ([Athena Widgets](https://www.x.org/releases/X11R7.7/doc/libXaw/libXaw.html))

[Running JAR-Packaged Software](https://docs.oracle.com/javase/tutorial/deployment/jar/run.html)

GUI Elements, Frames, Flow, Layoutmanager

Event Handling, Event-Driven Architecture

Homework: 15-01, Seite 305 .jar Files

## Design-Patterns (6/4/19)

MVC: [Model View Controller](https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm) 

[Singleton Pattern](https://www.geeksforgeeks.org/singleton-class-java/):
- eine Klasse soll nur ein Objekt haben (z.B. für Logging oder Warteschlangen)
- `private` Konstruktor, der nicht aufgerufen werden kann
- `private static` class variables

Aufgabe 16-01: Implementieren Sie eine Druckerwarteschlange

Java Literatur: [Wikibooks](https://en.wikibooks.org/wiki/Subject:Java_programming_language)

UML Modeling: [GenMyModel](https://www.genmymodel.com/)

<!--stackedit_data:
eyJoaXN0b3J5IjpbLTYxNTg0ODA5NSwtMjA0OTQ0NTIxOCwyMD
YwMzg0MjE1LDczNTcwODI3NCwtOTEwMzkzOTAzLC0xNzU2NDAz
MTkyLC0xMTYzNTQzMTg1LC0xMDQxNTE3NjUxLDEwMDY5MjA2Nz
QsLTEyNDQwMDM0MjksNjU3NTMxNjQ1LDE3NDQ3MjE4MjYsLTk2
MTc5MDk1MSwtMjM5MDU5NzQxLDczMDk5ODExNl19
-->