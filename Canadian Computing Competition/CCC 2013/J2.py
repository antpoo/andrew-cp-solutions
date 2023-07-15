import sys
valid = ['I', 'O', 'S', 'H', 'Z', 'X', 'N']

S = input()

for c in S:
    if c not in valid:
        print("NO")
        sys.exit()

print("YES")