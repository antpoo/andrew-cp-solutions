O = int(input())
V = O - 300
E = O - 200
W = O - 100
T = O
H = O + 100
SJ = O + 130

if V < 0: V += 2400
if E < 0: E += 2400
if W < 0: W += 2400
if H > 2400: H -= 2400
if SJ > 2400: SJ -= 2400
if SJ % 100 >= 60: SJ += 40

print(O, "in Ottawa")
print(V, "in Victoria")
print(E, "in Edmonton")
print(W, "in Winnipeg")
print(T, "in Toronto")
print(H, "in Halifax")
print(SJ, "in St. John's")