arr = []
S = input()
left = 0
for i in range(1, len(S)):
    curChar = S[i]
    lastChar = S[i-1]
    if lastChar.isdigit() and not curChar.isdigit():
        substr = S[left : i]
        left = i
        arr.append(substr)
    if i == len(S) - 1:
        substr = S[left : len(S)]
        arr.append(substr)

commands = [[]]
for i in range(len(arr)):
    commands.append([])
for i in range(len(arr)):
    if '+' in arr[i]:
        commands[i] = arr[i].split("+")
        print(commands[i][0] + " tighten " + commands[i][1])
    else:
        commands[i] = arr[i].split("-")
        print(commands[i][0] + " loosen " + commands[i][1])
