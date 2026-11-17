import random
x = int(input("how many numbers would you like? "))

thislist = [] 
for count in range(x):
      thislist.append(random.randint(1,x))

print(thislist)