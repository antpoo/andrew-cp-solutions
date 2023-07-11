square = [[0 for i in range(4)] for j in range(4)]

for i in range(4):
    square[i] = list(map(int, input().split()))

row1 = square[0][0] + square[0][1] + square[0][2] + square[0][3]
row2 = square[1][0] + square[1][1] + square[1][2] + square[1][3]
row3 = square[2][0] + square[2][1] + square[2][2] + square[2][3]
row4 = square[3][0] + square[3][1] + square[3][2] + square[3][3]

col1 = square[0][0] + square[1][0] + square[2][0] + square[3][0]
col2 = square[0][1] + square[1][1] + square[2][1] + square[3][1]
col3 = square[0][2] + square[1][2] + square[2][2] + square[3][2]
col4 = square[0][3] + square[1][3] + square[2][3] + square[3][3]


if row1 == row2 == row3 == row4 == col1 == col2 == col3 == col4:
    print("magic")
else:
    print("not magic")