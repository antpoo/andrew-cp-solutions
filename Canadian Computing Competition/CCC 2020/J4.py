import sys 

T = input()
S = input()

for i in range(len(S)):

    if S in T:
        print("yes")
        sys.exit()
    S = S[1:] + S[0]

print("no")