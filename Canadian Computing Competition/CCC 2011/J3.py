

n = int(input())
m = int(input())

sequence_list = [n, m]


while n >= m: 
    next_num = n - m 
    sequence_list.append(next_num) 
    n = m
    m = next_num 

print(len(sequence_list))