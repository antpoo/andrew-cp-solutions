K = int(input())
num_list = []

for i in range(K):
    x = int(input())
    if x == 0:
        num_list.pop()
    else:
        num_list.append(x)
print(sum(num_list))