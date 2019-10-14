# Deklarationen

text_1 = "Hallo Welt!"
text_2 = "FOM"
tupel = (1,2,3,4,5,6,7,8,9,10) # entspricht: tupel = tuple(range(1, 11))
liste_1 = [1,2,3,4,5,6,7,8,9,10] # s. o. (falls Sie die Zahlen nicht abschreiben wollen)
liste_2 = [6,7,8,9,10,11,12,13,14,15] # ...
zahl_1 = 6
zahl_2 = 12

# Uebung 1
print(len(text_1))
print(len(tupel))

# Uebung 2
print(text_1[0],text_1[-1])
print(tupel[0],tupel[-1])

# Uebung 3
print(text_1[0:4],tupel[0:4])
print(text_1[-3:],tupel[-3:])

# Uebung 4
print(liste_1[::2])

# Uebung 5
print(max(text_1))
print(min(liste_2))

# Uebung 6
liste_1 *= 3
print(liste_1)

# Uebung 7
gesamtliste = liste_1 + liste_2
gesamtliste += tupel
print(gesamtliste)

# Uebung 8
if zahl_1 in gesamtliste:
  print(zahl_1, "kommt in Gesamliste vor")

# Uebung 9
if zahl_1 in gesamtliste:
  print(gesamtliste.index(zahl_1)+1)
else:
  print("Kommt nicht vor")

# Uebung 10
print(zahl_1, "kommt", gesamtliste.count(zahl_1), "Mal in Liste vor")

# Uebung 11
if zahl_1 in gesamtliste:
  anzahl = gesamtliste.count(zahl_1) # Abfrage unnoetig, count gibt keinen Fehler sondern 0 zurueck
  pos = 0
  for i in range(0,anzahl):
   pos = gesamtliste.index(zahl_1,pos)
   print(pos)
   pos += 1

# Uebung 12
if ' ' in text_1:
  leer = text_1.index(' ')
  text = text_1[:leer]
text += ' '
text += text_2
text += '!'
print(text)

