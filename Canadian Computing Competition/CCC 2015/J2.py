s = input()

happyCount = s.count(":-)")
sadCount = s.count(":-(")

if happyCount > sadCount:
    print("happy")
elif sadCount > happyCount:
    print("sad")
elif happyCount == sadCount == 0:
    print("none")
else:
    print("unsure")