# https://dmoj.ca/problem/ccc11j3

n = int(input())
m = int(input())

sequence_list = [n, m]


while n >= m: # keep repeating until the number to the left is smaller than the number on the right
    next_num = n - m # get the next number 
    sequence_list.append(next_num) # add it to list
    n = m
    m = next_num 

print(len(sequence_list))