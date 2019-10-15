# Skriptorientierte Programmierung WS19 (9/2/19)

Prof. Dr. Marcel B. Endejan
[marcel.endejan@fom.de](mailto:marcel.endejan@fom.de)

## Typisierung (9/23/19)

- Dynamisch (Basic, Python)
- Statisch (Pascal, C)
- Stark (Python)
- Schwach (Javascript, C (wg. typecast))

*input() liefert immer einen String!*

Klausur: [Merkmale eine Skriptsprache](https://www.seo-analyse.com/seo-lexikon/s/scriptsprache/)

## Kontrollstrukturen (9/30/19)

`range(10)` = 0..9
`range(1,11)` = 1..10
`range(1,11,2)` = 1,3,5,7,9

`pass` = empty operation

`try:` (Fehlerbehandlung)
`except:` (im Fehlerfall)
`else:` (ohne Fehler)
`finally:` (immer)

## Datentypen (10/14/19)

int(), float(), bool(), complex()

"+=" bzw. "-=" funktioniert nur bei bereits initialisierten Variablen!

int 28: 0x1c (Hex) oder 0b11100 (Binary) 

`~x` : bitweises Komplement
`\>>` : shift right (&divide; 2)
`\<<` : shift left (&times; 2)

Bool: True(1), False(0) - 0, None, leer : False - alles andere : True

Sei a = [1,2,3], b = [], c = [4,5,6]
a or b or c = [1,2,3] (erstes Element das wahr ist, d.h. nicht leer - auch (a or b or c)[0] = 1)
not[1,2,3] = False (nicht leer)

Float: `inf` / `-inf` (Infinite), `nan` (Not a Number, d.h. undefiniert)

Float kann man nicht mit "==" vergleichen (Ungenauigkeit in der internen Darstellung)

complex = real + imag &times; j - wobei j^2^=-1

immutable = Jede Zuweisung / Operation erzeugt ein neues Objekt


<!--stackedit_data:
eyJoaXN0b3J5IjpbMTk0NzU5NjM1Nyw3ODU2NTU4MzEsMzMyMj
IwNjUwLDE0NTYzMzc3MjUsNDk1MzExODU1LC0xNTg1Njc5MzEs
LTY2ODkwMDc3OSw3MDg5MDE2MDYsLTY2ODY2MjQ1OSw3MzA5OT
gxMTZdfQ==
-->