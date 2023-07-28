# create a dicionary to store A and B
dictionary = {"A": 0,
              "B": 0}
# start our loop
while True:
    instructions = input().split()
    
    # the instruction is the first number in the input
    instruction = int(instructions[0])

    if instruction == 7:
        break
    # getting X
    X = instructions[1]

    # getting Y
    if len(instructions) == 3:
        Y = instructions[2]

    # instruction type 1:
    if instruction == 1:
        dictionary[X] = int(Y)
    
    # instruction type 2:
    elif instruction == 2:
        # someone print the variable of X
        print(dictionary[X])

    # instruction type 3:
    # X += Y
    elif instruction == 3:
        dictionary[X] += dictionary[Y]

    # instruction type 4:
    # X *= Y
    elif instruction == 4:
        dictionary[X] *= dictionary[Y]

    # instruction type 5:
    # X -= Y
    elif instruction == 5:
        dictionary[X] -= dictionary[Y]
    
    # instruction type 6:
    # X //= Y
    elif instruction == 6:
        dictionary[X] //= dictionary[Y]