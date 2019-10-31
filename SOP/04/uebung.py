# Uebung 1
gerade = list(range(2,21,2))
ungerade = list(range(1,20,2))
print(gerade)
print(ungerade)

# Uebung 2
alle = gerade + ungerade
alle.sort()
print(alle)

# Uebung 3
a, b, c = gerade[:3]
print(a,b,c)

# Uebung 4
gerade_mal_zehn = [z*10 for z in gerade]
print(gerade_mal_zehn)

# Uebung 5
gerade[1::2] = gerade_mal_zehn[1::2]
print(gerade)

# Uebung 6
gerade_mal_zehn.sort(reverse=True)
print(gerade_mal_zehn)

# Uebung 7
zahlen = list(range(-4,4))
zahlen.sort(key=abs)
print(zahlen)

# Uebung 8
einkaufsliste=["aepfel", "birnen", "orangen", "bananen"]
print(einkaufsliste)

# Uebung 9
for i in range(3,-1,-1):
  einkaufsliste.insert(i, "schokolade")
print(einkaufsliste)

# Uebung 10
einkaufsliste[0] = "erdnuesse"
print(einkaufsliste)

# Uebung 11
del einkaufsliste[0:7:2]
print(einkaufsliste)

# Uebung 12
einkaufsliste2 = einkaufsliste.copy()
print(einkaufsliste2)

# Uebung 13
einkaufsliste.reverse()
print(einkaufsliste)

# Uebung 14
j = len(einkaufsliste)
for i in range(0,j):
  print(einkaufsliste[0])
  einkaufsliste.pop(0)

# Uebung 15
einkaufsliste2 += ["studentenfutter"]
print(einkaufsliste2)

# Uebung 16
einkaufsliste2.remove("birnen")
print(einkaufsliste2)

# Uebung 17
vornamen = ["erwin", "walter", "liselotte", "heinrich", "gwyneth"]
nachnamen = ["lindemann", "hoppenstedt", "hoppenstedt", "loose", "molesworth"]
anrede = ["hr.", "hr.", "fr.", "hr.", "mrs."]
print(vornamen)
print(nachnamen)
print(anrede)

# Uebung 18
anrede_neu = ['herr' if anr == 'hr.' else 'frau' for anr in anrede]
print(anrede_neu)

# Uebung 19
personen = list(zip(anrede_neu, vornamen, nachnamen))
print(personen)

# Uebung 20
ausgabe = list(enumerate(personen,1))
for nr, person in ausgabe:
  print(nr, ":", *person)

# Uebung 21
liste = [0,1,[20,21,22],[30,31,32],(40,41,42)]
kopie = liste.copy()
print("Liste:", liste)
print("Kopie:", kopie)
liste[0] = 'null'
print("Liste:", liste)
print("Kopie:", kopie)
kopie[1] = 'EINS'
print("Liste:", liste)
print("Kopie:", kopie)
kopie[2] = 'ZWEI'
print("Liste:", liste)
print("Kopie:", kopie)
kopie[3][0] = 'DREI-NULL'
print("Liste:", liste)
print("Kopie:", kopie)
try:
  kopie[4][0] = 'VIER-NULL'
except TypeError as fehler:
  print("Fehler:", fehler)
print("Liste:", liste)
print("Kopie:", kopie)

