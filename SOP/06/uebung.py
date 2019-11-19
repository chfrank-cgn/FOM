import random
from collections import defaultdict
print()

# Uebung 1
spielkugeln = frozenset(range(1,50))

# Uebung 2
kugeln_in_trommel = set(spielkugeln)
kugeln_in_ablage = set(())

# Uebung 3
for i in random.sample(range(1,50),6):
  kugeln_in_trommel.remove(i)
  kugeln_in_ablage.add(i)

# print("Verbleibende Kugeln", kugeln_in_trommel)
# print("Gewinnzahlen", sorted(kugeln_in_ablage))

# Uebung 4a
ziehungen = {}
ziehungsdaten = ("2017-08-05", "2017-08-12", "2017-08-19", "2017-08-26")
alle_gezogenen_zahlen = set()
zahlen_statistik = {}
zahlen_default = defaultdict(list)
for datum in ziehungsdaten:
  kugeln_in_trommel = set(spielkugeln)
  kugeln_in_ablage = set(())
  for i in random.sample(range(1,50),6):
    kugeln_in_trommel.remove(i)
    kugeln_in_ablage.add(i)
    alle_gezogenen_zahlen.add(i)
    # Iterative method
    if i in zahlen_statistik:
      zahlen_statistik[i] += " "
      zahlen_statistik[i] += datum
    else:
      zahlen_statistik[i] = datum
    # Defaultdict
    zahlen_default[i].append(datum)
  print("Zahlen der Ziehung",datum,sorted(kugeln_in_ablage))
  ziehungen[datum] = sorted(kugeln_in_ablage)

# Uebung 4b
print("\nInhalt des Dictionaries", ziehungen)

# Uebung 5
print("\nAlle gezogenen Zahlen", sorted(alle_gezogenen_zahlen))

# Uebung 6a
print("\nInhalt der Statistik (iterative)", zahlen_statistik)
print("\nInhalt der Statistik (defaultdict)", zahlen_default)

# Uebung 6b
tab = "{0:4} | {1:40}"
print("\nZahl | Ziehung(en)")
print("-----+-------------------------------------------------------------")
for i in range(1,50):
  if i in zahlen_statistik:
    print(tab.format(i, zahlen_statistik[i]))

# Uebung 6c
print("\nZahl | Ziehung(en)")
print("-----+-------------------------------------------------------------")
for i in range(1,50):
  if i in zahlen_default:
    print(" {0:3d} | ".format(i), zahlen_default[i])

print()
exit()

