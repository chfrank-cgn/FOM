
# Objektorientierte Programmierung SS 19 (3/5/19)

Salah Zayak, B.Sc.

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

for (\<type\> \<variable\> :  \<array\>) {
    ...
}

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





<!--stackedit_data:
eyJoaXN0b3J5IjpbLTg5NTMxNzExMiwtMTI0NDAwMzQyOSw2NT
c1MzE2NDUsMTc0NDcyMTgyNiwtOTYxNzkwOTUxLC0yMzkwNTk3
NDEsNzMwOTk4MTE2XX0=
-->