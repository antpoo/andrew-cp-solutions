win_count = 0
for i in range(6):
    if input() == 'W':
        win_count += 1

if win_count == 5 or win_count == 6:
    print(1)
elif win_count == 3 or win_count == 4:
    print(2)
elif win_count == 1 or win_count == 2:
    print(3)
else:
    print(-1)