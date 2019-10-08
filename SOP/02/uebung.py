# Uebungsblatt 2

# Uebung 1
i = 28
f = 28.0

print(i, id(i), type(i))
print(f, id(f), type(f))

# Uebung 2
i = 28.0
f = 28.0

print(i, id(i), type(i))
print(f, id(f), type(f))

# Uebung 3
s = "Hello"
s2 = s
print(s, id(s), s2, id(s2))
s += " World"
print(s, id(s), s2, id(s2))

# Uebung 4
m = ['a', 'b', 'd', 'e', 'f']
print(m, id(m))
m[0]='A'
print(m, id(m))

# Uebung 5
m2 = m
print(m, id(m), m2, id(m2))
m += 'g'
print(m, id(m), m2, id(m2))

# Uebung 6
t = (1, 2, [31, 32], 4)
t2 = t
print(t, id(t), t2, id(t2))
# t[0] = 'X'
# t[2,0] = 'X'
# TypeError: 'tuple' object does not support item assignment

# Uebung 7
t += 5,
print(t, id(t), t2, id(t2))

# Uebung 8
del t
# print(t, id(t), t2, id(t2))
# NameError: name 't' is not defined
print(t2, id(t2))
del t2
# print(t2, id(t2))
# NameError: name 't2' is not defined

# Uebung 9
x = 5
y = '5'
# z = x + y
# TypeError: unsupported operand type(s) for +: 'int' and 'str'

