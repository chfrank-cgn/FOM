# Uebung 1 - 5

eingabe = input("Bitte geben Sie ein: ")

print(eingabe)
print(len(eingabe))

laenge = len(eingabe)
umfang = 'Kurz'

if laenge < 3:
  print('Kleiner')
elif laenge >= 3:
  print('Groesser gleich')
  if laenge > 10:
    print('Sehr gross')
    umfang = 'Lang';

print(umfang)

