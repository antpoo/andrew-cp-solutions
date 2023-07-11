string1 = list(input())
string2 = input()
notenough = True
for character in string2:
    if character == "*":
        continue
    if character in string1:
        string1.remove(character)
    else:
        notenough = False
if notenough == True:
    print("A")
else:
    print("N")