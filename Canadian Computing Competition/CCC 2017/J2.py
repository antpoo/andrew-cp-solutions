N, K, Total = int(input()), int(input()), 0
for i in range(K + 1): 
    Total += 10 ** i * N
print(Total)