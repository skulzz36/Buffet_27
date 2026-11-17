length = int(input("Please enter line length: "))
direction = input("Horizontal or Vertical? ")

if direction == "Vertical" or direction == "vertical":
    for x in range(length):
        print("*")

elif direction == "Horizontal" or direction == "horizontal":
    for x in range(length):
        print("*", end="")

else:
    print("Please enter Horizontal or Vertical")
