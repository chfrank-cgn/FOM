# Uebung 1
def quadrat(x):
  return x**2

x = 10
print quadrat(x)

# Uebung 2
def quadrat(x=None):
  if x == None:
    return None
  else:
    return x**2

print(quadrat(x))
print(quadrat())

# Uebung 3
def addition(*many):
  print("Adding", many)
  ret = 0
  for i in many:
    ret += i
  return ret

print("3+4", addition(3,4))
print("4+5+6+7+8", addition(4,5,6,7,8))

# Uebung 4
def quad_func(x, a, b, c):
  ret = (a*(x**2)) + (b*x) + c
  return ret

for i in range(0,11):
  print("Quad", i, quad_func(i,1,2,3))

# Uebung 5
def quad_func(x, a=1, b=1, c=1):
  ret = (a*(x**2)) + (b*x) + c
  return ret

for i in range(0,11):
  print("Quad", i, quad_func(i))

# Uebung 5
print("a=6", quad_func(10,5))
print("c=5", quad_func(10,c=5))

# Uebung 7
parameter = (2,3,4)
print("10,2,3,4", quad_func(10, *parameter))

# Uebung 8
parameter = dict(a=2, b=3, c=4)
print("10,2,3,4", quad_func(10, **parameter))

# Uebung 9
def addition(*many):
  print("Adding", many)
  for i in many:
    if type(i) != int and type(i) != float:
      print("Can only add int or float")
      return
  ret = 0
  for i in many:
    ret += i
  return ret

print("3+4", addition(3,4))
print("3+4.2", addition(3,4.2))
print("3+y", addition(3,"y"))

