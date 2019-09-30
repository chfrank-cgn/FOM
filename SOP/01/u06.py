# Uebung 6 - 8, 13

geb = 10000

while (geb < 1582) or (geb > 2015):
  geb = int(input("Enter year between 1582 and 2015: "))
  print("Year ", geb)
  if ((geb % 4 == 0) and (geb % 100 != 0)) or (geb % 400 == 0):
    print("Schaltjahr")
  if (geb == 0):
    print('End program')
    break
  if (geb == 1):
    geb = 10000

