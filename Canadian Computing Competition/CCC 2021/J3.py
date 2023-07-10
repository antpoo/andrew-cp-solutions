lastDirection = ""
while True:
     S = input()
     if S == "99999":
          break
     firstTwo = sum(map(int, S[0:2]))
     if firstTwo == 0:
          print(lastDirection, S[2:6])
     elif firstTwo % 2 == 0:
          print("right", S[2:6])
          lastDirection = "right"
     else:
          print("left", S[2:6])
          lastDirection = "left"