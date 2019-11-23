import sys
import readline

# Uebung 1
def datum_einlesen():
  day = int(input('Please enter date: '))
  month = int(input('Please enter month: '))
  year = int(input('Please enter month: '))
  return [day, month, year]

datum = datum_einlesen()
tag, monat, jahr = datum
print(datum)
print(tag, monat, jahr)

# Uebung 2
def datum_formatieren(tag, monat, jahr, ausgabe=False):
  date_format = "{:02}.{:02}.{:4}"
  ret = date_format.format(tag, monat, jahr)
  if ausgabe:
    print("Ausgabe", ret)
  return ret

print(datum_formatieren(15,10,1582,True))

# Uebung 3a, 3b, 3c
daten = (19,12,2014), (28,2,2014), (29,2,2014), (29,2,2000), (29,2,1900), (31,4,2014), (15,13,2015)
print(daten)

def gueltiges_datum(tag, monat, jahr, minj=1950, maxj=2050, msg=False):
  ret = (False, False, False)
  if type(tag) == int:
    if (tag < 32) and (tag > 0):
      ret = (True, False, False)
    else:
      if msg:
        print("Wrong date:", tag)
      return ret
  if type(monat) == int:
    if (monat < 13) and (monat > 0):
      ret = (True, True, False)
    else:
      if msg:
        print("Wrong month:", monat)
      return ret
  if type(jahr) == int:
    if (jahr <= maxj) and (jahr >= minj):
      ret = (True, True, True)
    else:
      if msg:
        print("Wrong year:", jahr)
  return ret

for d in daten:
  print(d, gueltiges_datum(*d, msg=True))

# Uebung 3d
print("31.12.1948", gueltiges_datum(31,12,1948,1900,2000))
print("31.12.2150", gueltiges_datum(31,12,2150,maxj=2200))

# Uebung 4
februar = lambda datum : datum[1] == 2
daten_im_februar = list(filter(februar, daten))
print(daten_im_februar)

# Uebung 5
februar_tage = lambda datum : datum[0] < 29
gueltige_daten_im_februar = list(filter(februar_tage, daten_im_februar))
print(gueltige_daten_im_februar)

# Uebung 6
formatierte_daten = [datum_formatieren(*d) for d in daten]
print(formatierte_daten)
sortkey = lambda datum : datum[6:]+datum[3:5]+datum[:2]
formatierte_daten.sort(key=sortkey)
print(formatierte_daten)

# Uebung 7a
repldash = lambda datum : datum.replace('.', '-')
umformatierte_daten = list(map(repldash, formatierte_daten))
print(umformatierte_daten)

# Uebung 7b
def datum_iso(datum):
  ret = ''
  ret = datum[6:] + '-' + datum[3:5] + '-' + datum[:2]
  return ret

umformatierte_daten = list(map(datum_iso, formatierte_daten))
print(umformatierte_daten)

