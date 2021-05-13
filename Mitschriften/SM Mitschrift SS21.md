# Sicherheitsmanagement (5/3/21)
Dr.-Ing. George Hallak ([georgehllk@hotmail.com](mailto:georgehllk@hotmail.com))

## Zusammenfassung

PDCA: Plan - Do - Check - Act

ROSI: Return on Security Invest

Security Event: Ereignis - Auswirkungen
Security Incident: Vorfall - hohe Wahrscheinlichkeit

Schutzziel: Intergrität, Verfügbarkeit, Vertraulichkeit
Datenschutz: Dazu Transparenz, Intervenierbarkeit, Nicht-Verkettbarkeit

ISMS: Assets
DSMS: Personenbezogene Daten

ALE: Annual Loss Expenditure = Recovery Costs - Savings + Total Costs
ROSI: Recovery Costs - ALE
ROSI: Savings - Total Costs
(See: https://svs.informatik.uni-hamburg.de/publications/2014/2014-02-20-Federrath-Berlin.pdf)

Sicherheit: Verlässlichkeit, Schutz, Zugang
Datenschutz: Zugangsbeschränkung für Befugte, Beschränkung der Erfassung, Abgleich und Weitergabe

Bedrohung: Potential
Angriff: Tatsächlicher Angriff

Sicherheitsniveau erhöhen, um Restrisiko zu senken

Bedrohungsmodelle:
- Aktiv: DDoS, Man-in-the-Middle verändert, Spoofing
- Passiv: Man-in-the-Middle hört zu

Security by Obscurity: Nicht effektiv!

[Kerkhoff Prinzip](https://en.wikipedia.org/wiki/Kerckhoffs%27s_principle): "A cryptosystem should be secure even if everything about the system, except the key , is public knowledge."

Privacy by Design

Abgrenzung: IT-Sicherheitsbeauftragter / Datenschutzbeauftragter

Vertraulichkeit - Integrität - Verfügbarkeit
Transparenz - Konsistenz

Anonymität - Pseudonymität

Integrität:
- Need to know
- Separation of duties / concerns
- Rotation of duties

[Caesar-Chiffre](https://en.wikipedia.org/wiki/Caesar_cipher) (Alphabetverschiebung)

Monoalphabeitsche Chiffren (Schlüsselraum zu klein)

[Vigenère-Verschlüsselung](https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher) (grosses Schlüsselwort)

[Vernam Verschüsselung](https://www.hypr.com/vernam-cipher/) (Stromverschlüsselung)

[One-Time-Pad](https://en.wikipedia.org/wiki/One-time_pad) - ziemlich sicher gegen Brute-Force Attacken

[Perfect Secrecy](https://crypto.stackexchange.com/questions/3896/simply-put-what-does-perfect-secrecy-mean): Perfect secrecy is the notion that, given an encrypted message (or ciphertext) from a perfectly secure encryption system (or cipher), absolutely nothing will be revealed about the unencrypted message (or plaintext) by the ciphertext.

Symmetrische Verschlüsselung: Es wird der gleiche Schlüssel zum Ver- und Entschlüsseln verwendet.
(AES, DES, Triple-DES, HCBI, SSL, TLS)

Note: DES kann in etwa 10 Stunden überwunden werden, 3DES ist ok

[AES](https://en.wikipedia.org/wiki/Advanced_Encryption_Standard): [NIST](https://www.nist.gov/) schlägt [Rijndael](https://blog.finjan.com/rijndael-encryption-algorithm/) vor

[Diffie-Hellmann](https://security.stackexchange.com/questions/45963/diffie-hellman-key-exchange-in-plain-english) Schlüsselaustausch

[RSA](https://en.wikipedia.org/wiki/RSA_%28cryptosystem%29) Algorithmus (ab 1024bit) - [asymmetrisch](https://www.exabeam.com/information-security/rsa-algorithm/)

Hash-Funktionem: Normal / Kryptographisch

[Geburtstagsproblem](https://betterexplained.com/articles/understanding-the-birthday-paradox/) 

[Message Authentication Code](https://en.wikipedia.org/wiki/Message_authentication_code)

[X.509](https://searchsecurity.techtarget.com/definition/X509-certificate) Certificate Authority

Datenverarbeitung: Technische und organisatorische Massnahmen
- [DSGVO](https://dsgvo-vorlagen.de/tom-nach-dsgvo-richtig-dokumentieren) Artikel 5 und 32
- ISO 27001

## Transferaufgabe

"Führen Sie den Diffie-Hellman Key Exchange mit p = 13, g=9 und q=7, r=5 durch. Bestimmen Sie das gemeinsame Geheimnis. Zeigen Sie dabei, welche Berechnungen Alice und Bob ausführen und welche Daten Sie an den jeweils anderen übertagen."


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTM0NDM0OTk5OSwtMzAyNTg3MTYxLDg2OT
Y2NDkzNV19
-->