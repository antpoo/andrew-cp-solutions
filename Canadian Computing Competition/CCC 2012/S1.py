fourth_player = int(input()) 
ans = 0 

for first_player in range(1, fourth_player - 2):
    for second_player in range(first_player + 1, fourth_player - 1): 
        for third_player in range(second_player + 1, fourth_player):
            ans += 1

print(ans)