# Sicherheitsmanagement (5/3/21)
Dr.-Ing. George Hallak ([georgehllk@hotmail.com](mailto:georgehllk@hotmail.com))

## Zusammenfassung

- Sicherheit
- Datenschutz
- Bedrohung
- Angriff

**PDCA**: Plan - Do - Check - Act

**ROSI**: Return on Security Invest

Security Event: Ereignis - Auswirkungen
Security Incident: Vorfall - hohe Wahrscheinlichkeit

Schutzziel: Intergrität, Verfügbarkeit, Vertraulichkeit
Datenschutz: Dazu Transparenz, Intervenierbarkeit, Nicht-Verkettbarkeit

Was wollen wir schützen? Wie schlimm ist ein Breach / Ausfall?

**ISMS**: Assets
**DSMS**: Personenbezogene Daten

**ALE**: Annual Loss Expenditure = Recovery Costs - Savings + Total Costs
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

[Privacy by Design](https://deviq.io/resources/articles/privacy-by-design/):
- Proactive not Reactive
- Privacy as the Default
- Full Functionality
- End-to-End Security
- Visibility and Transparency
- Privacy Embedded into Design
- Respect for User Privacy

Abgrenzung: IT-Sicherheitsbeauftragter / Datenschutzbeauftragter
Abgrenzung: IT-Sicherheit / Datenschutz

Vertraulichkeit (SSL) - Integrität (Auth) - Verfügbarkeit (Sign) / Verbindlichkeit
Neu: Transparenz - Konsistenz

- Verdeckheit
- Unbeobachtbarkeit
- Unverkettbarkeit
- Nicht-Verfolgbarket

Anonymität - Pseudonymität

Authentizität: Something you
- know: Password
- have: Token
- are: Biometric properties

Integrität:
- Need to know
- Separation of duties / concerns
- Rotation of duties

Kryptoziele:
- private Kommunikation, private Daten - Vertraulichkeit
- festellen von Änderungen - Integrität
- prüfen der Identität und Echtheit der Daten - Authentizität
- unterschreiben von Daten - Verbindlichkeit

Hash, MAC, Signature

Semiotik:
- Syntaktik: Zeichen und Regeln
- Sigmatik: + Beziehung
- Semantik: + Bedeutung
- Pragmatik: +Zweck

Angriffe:
- Ciphertext-Only
- Known-Plaintext
- Chosen Plaintext
- Chosen Ciphertext

[Caesar-Chiffre](https://en.wikipedia.org/wiki/Caesar_cipher) (Alphabetverschiebung)

Keyword: "WOW, SUCH SECRET VERY HIDDEN" -> WOSUCHERTVYIDN

    A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    W O S U C H E R T V Y I D N A B J G J K L M P Q X Z

Monoalphabeitsche Chiffren (Schlüsselraum zu klein)

[Vigenère-Verschlüsselung](https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher) (grosses Schlüsselwort)
Vignère Square: Alphabet-Verschlüsselung mit zusätzlichem Keyword

[Vernam Verschüsselung](https://www.hypr.com/vernam-cipher/) (XOR Stromverschlüsselung)

[One-Time-Pad](https://en.wikipedia.org/wiki/One-time_pad) - ziemlich sicher gegen Brute-Force Attacken

[Perfect Secrecy](https://crypto.stackexchange.com/questions/3896/simply-put-what-does-perfect-secrecy-mean): Perfect secrecy is the notion that, given an encrypted message (or ciphertext) from a perfectly secure encryption system (or cipher), absolutely nothing will be revealed about the unencrypted message (or plaintext) by the ciphertext.

=> A-Priori Wahrscheinlichkeit == A-Posteriori Wahrscheinlichkeit

Secrecy &ne; security!

Symmetrische Verschlüsselung: Es wird der gleiche Schlüssel zum Ver- und Entschlüsseln verwendet.
(AES, DES, Triple-DES, HCBI, SSL, TLS)

Note: DES kann in etwa 10 Stunden überwunden werden, 3DES ist ok

[Electronic Code Book Mode](https://en.wikipedia.org/wiki/Block_cipher_mode_of_operation#Electronic_codebook_(ECB)) 

[Cipher Block Chaining Mode](https://en.wikipedia.org/wiki/Block_cipher_mode_of_operation#Cipher_block_chaining_(CBC))

[AES](https://en.wikipedia.org/wiki/Advanced_Encryption_Standard): [NIST](https://www.nist.gov/) schlägt [Rijndael](https://blog.finjan.com/rijndael-encryption-algorithm/) vor

[Diffie-Hellmann](https://security.stackexchange.com/questions/45963/diffie-hellman-key-exchange-in-plain-english) Schlüsselaustausch

[RSA](https://en.wikipedia.org/wiki/RSA_%28cryptosystem%29) Algorithmus (ab 1024bit) - [asymmetrisch](https://www.exabeam.com/information-security/rsa-algorithm/)
Rivest - Shamir - Adleman
- Schlüssel aus Primzahlen
- RSA-Modul 
- Zwei Schlüssel: Public + Private

RSA Encryption: Alice encrypts with Bob's public key, Bob decrypts with his private key
RSA Signature: Alice signs with her private key, Bob validates the signature with Alice's public key

Hash-Funktionen: Normal / Kryptographisch
- [pre-Image Resistenz](https://en.wikipedia.org/wiki/Preimage_attack)
- 2nd pre-Image Resistenz (schwache Kollisionsresistenz)
- [Kollisionsresistenz](https://en.wikipedia.org/wiki/Collision_resistance)

[Merkle–Damgård construction](https://en.wikipedia.org/wiki/Merkle%E2%80%93Damg%C3%A5rd_construction)
2<sup>128</sup> gilt als sicher

[Geburtstagsproblem](https://betterexplained.com/articles/understanding-the-birthday-paradox/) 

[Message Authentication Code](https://en.wikipedia.org/wiki/Message_authentication_code)
Symmetrischer Schlüssel als geheimer Parameter - Authentizität / Integrität

[X.509](https://searchsecurity.techtarget.com/definition/X509-certificate) Certificate Authority

Integrität &ne; Verschlüsselung

**PKI**: Public Key Infrastructure

Datenverarbeitung: Technische und organisatorische Massnahmen
- [DS-GVO](https://dsgvo-vorlagen.de/tom-nach-dsgvo-richtig-dokumentieren) Artikel 5 und 32
- ISO 27001 - ISMS Anforderungen
- BSI Grundschutz 200-1, 200-2, 200-3

Daten: Erheben - Verarbeiten - Nutzen 

Ursachen & Massnahmen

**PPP**: Passörter, Patching, Prävention

Technische & organisatorische Massnahmen:
- Zutrittskontrolle 
- Zugangskontrolle
- Zugriffskontrolle
- Datenträgerkontrolle
- Weitergabe-, Übertragungs- und Transportkontrolle
- Eingabekontrolle
- Auftragskontrolle
- Verfügbakeitskontrolle
- Trennungskontrolle
- Wiederherstellbarkeit

Risiken:
- Strategisch
- Unternehmensumwelt / -umfeld
- Marktrisiko
- Kreditrisiko
- Operatives Risiko
- Compliance-Risiko

Risiko: Gefahr trifft auf Schwachstelle

Schutzbedarfsanalyse: "Normal", "Hoch", "Sehr hoch"

Risiko-Management
- Initialisierung
- Identifizierung
- Beurteilung
- Steuerung
- Überwachung

## Transferaufgabe

"Führen Sie den Diffie-Hellman Key Exchange mit p = 13, g=9 und q=7, r=5 durch. Bestimmen Sie das gemeinsame Geheimnis. Zeigen Sie dabei, welche Berechnungen Alice und Bob ausführen und welche Daten Sie an den jeweils anderen übertagen."

Generator: g=9
Primzahl: p =13
Alice: q=7
Bob: r=5

1. Schritt: Alice

v = g<sup>q</sup> mod p  --  *"Generator hoch Alice"*
v = 9<sup>7</sup> mod 13 = 9

Alice sendet {p,g,v} = {13,9,9}

2. Schritt Bob

w = g<sup>r</sup> mod p  --  *"Generator hoch Bob"*
w = 9<sup>5</sup> mod 13 = 3

Bob sendet {p,g,w} = {13,9,3}

3. Berechnung von s

Alice: s = w<sup>q</sup> mod p = 3<sup>7</sup> mod 13 = 3  --  *"Bob-geschickt hoch Alice"*
Bob: s = v<sup>r</sup> mod p = 9<sup>5</sup> mod 13 = 3  --  *"Alice-geschickt hoch Bob"*

Alice und Bob haben beide {q,r,s} = {7,5,3}, ohne dass s je über die Leitung ging

Das BSI empfiehlt: p sollte 3000 Bit lang sein, q und r jeweils mindestens 250; p sollte eine starke Primzahl sein, mit einem Zyklus von mindestens 2<sup>250</sup>.

<!--stackedit_data:
eyJoaXN0b3J5IjpbNDYxODk4NjExLC04NDk1MTU3NjgsLTE5Nz
gyOTEzMzUsODczMDU2NDQ4LC0zNDQzNDk5OTksLTMwMjU4NzE2
MSw4Njk2NjQ5MzVdfQ==
-->