import os

# Open logfile
try:
  logfile = open("node_13.81.173.84_09.log", "r", encoding="utf-8")
except (IOError) as e:
  print("File open error", e.args[1])
  os.exit(1)

# Uebung 1
loglist = logfile.readlines()
print("Number of lines:", len(loglist))
print("First ten entries: \n", loglist[:10])

# Close logfile
logfile.close()

# Uebung 2
log_info = []
for line in loglist:
  warum = ''
  warum_pos = line.find(']') + 1
  if (warum_pos > 0):
    warum = line[warum_pos:]
  zeile = line.split()
  wer = zeile[4]
  wann = zeile[2]
  was = zeile[5]
  log_info += [wer, wann, was, warum],

# Uebung 3
for nummer, eintrag in enumerate(log_info[:10]):
  print(nummer, eintrag)

# Uebung 4
tab = "| {0:10.10} | {1:10.10} | {2:22.22} | {3:40.40} |"
print('-'*95)
print(tab.format('Wer', 'Wann', 'Was', 'Warum'))
print('-'*95)
for a, b, c, d in log_info[:10]:
  print(tab.format(a, b, c, d))
print('-'*95)

# Uebung 5
try:
  logcsv = open("node_13.81.173.84_09.csv", "w", encoding="utf-8")
except (IOError) as e:
  print("File open error", e.args[1])
  os.exit(1)

print("wer", "wann", "was", "warum", sep=';', file=logcsv)
for a, b, c, d in log_info:
  print(a.strip(), b.strip(), c.strip(), d.strip(), sep=';', file=logcsv)
logcsv.close()

exit()

