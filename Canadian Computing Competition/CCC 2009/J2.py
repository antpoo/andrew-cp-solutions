TroutPoints = int(input())
PikePoints = int(input())
PickerelPoints = int(input())
Max = int(input())
MaxTrout = Max // TroutPoints
MaxPike = Max // PikePoints
MaxPickerel = Max // PickerelPoints
count = 0

# For loop for all possible amounts of trout
for trout in range(0, MaxTrout + 1):
    # For loop for all possible amounts of pike
    for pike in range(0, MaxPike + 1):
        # for loop for all possible amounts of pickerel
        for pickerel in range(0, MaxPickerel + 1):
            
            # making sure there is at least 1 fish
            if trout + pike + pickerel == 0:
                continue

            # check if we are within the limit
            
            if trout * TroutPoints + pike * PikePoints + pickerel * PickerelPoints <= Max:
                count += 1
                print(trout, "Brown Trout,", pike, "Northern Pike,", pickerel, "Yellow Pickerel")
print("Number of ways to catch fish:", count)