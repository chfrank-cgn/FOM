# Uebung 11

liste = []

for i in range(1,4):
  zahl = int(input("Bitte geben Sie eine positive Zahl ein: "))
  if (zahl < 0):
    break
  liste += [zahl]
else:
  for z in liste:
    print(z, z**2)

