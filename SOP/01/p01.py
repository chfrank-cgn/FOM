# Initialisierung

import random

# geheimzahl = 4712
geheimzahl = random.randint(1, 100)
abbruch =10 
eingabe = 0
zaehler = 0

# Schleife
while eingabe != geheimzahl:
  eingabe = int(input("Ganze Zahl eingeben: "))
  if eingabe < geheimzahl:
    print("Zahl zu klein")
  if eingabe > geheimzahl:
    print("Zahl zu gross")
  zaehler = zaehler + 1
  if zaehler > abbruch:
    print("Sie haben zu viele Versuche benoetigt!")
    exit()

print("Richtig, Sie haben ",zaehler," Versuche benoetigt", sep='')

exit()

