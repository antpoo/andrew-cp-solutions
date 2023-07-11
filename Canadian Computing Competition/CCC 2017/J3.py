
x1, y1 = map(int, input().split()) 
x2, y2 = map(int, input().split())
moves = int(input())

min_dist = abs(x1 - x2) + abs(y1 - y2)

if moves >= min_dist and moves % 2 == min_dist % 2:
    print("Y")
else:
    print("N")