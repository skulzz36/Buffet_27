max = int(input("pleaase enter A single number. "))
sum = 0

for count in range(1,max):
    print(count, end="+")
    sum = sum + count 

print(max)
sum = sum+max
print("the sum is " + str(sum))