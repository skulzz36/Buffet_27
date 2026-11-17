import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()

# Jokes with 1 part just have a joke
# joke["joke"] -> References the String of the joke itself

# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke

x = int(input("how many times do you want a joke?  "))
type = input("would yo like to have a single parter or double?(single/double )")

print(joke["joke"])
print(joke["type"])

if type =="single":
    for count in range (0,x):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        print = (joke["joke"])
elif type == "double":
     for count in range(0, x):
        joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        print(joke2Part["setup"])
        print(joke2Part["delivery"])
else:
    print("You didnt pick a single or a double...")         

