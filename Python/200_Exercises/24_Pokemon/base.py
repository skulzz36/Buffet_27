import requests

pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/pikachu").json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

print(pokemon["name"])