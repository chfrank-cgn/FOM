import random

# Uebung 1
zufallszahlen = random.sample(range(1,1000),20)
print(zufallszahlen)

# Uebung 2
teilbar7 = [x for x in zufallszahlen if x%7==0]
print(teilbar7)

# Uebung 3
zufallszahlen_enum = list(enumerate(zufallszahlen))
teilbar7_enum = [(pos, zahl) for pos,zahl in zufallszahlen_enum if zahl%7==0]
print(teilbar7_enum)

# Uebung 4
mit_ziffer_0 = [x for x in zufallszahlen if '0' in str(x)]
print(mit_ziffer_0)

# Uebung 5
print("Anzahl Zahlen mit 0:", len(mit_ziffer_0))

# Uebung 6
print("Anzahl Nullen ingesamt:", str(zufallszahlen).count('0'))

