# Lists are basically an ordered way of grouping things (called elements)the cool thing about lists in Python is that you can have a list that contains objects of multiple types. Your list can mix between strings, integers, objects, other lists, what have you.
a = [1, 2, 3, "", "Supri", 6, 5]
for i in a:
    if (i == 6):
        break
    elif (i == ""):
        print("kosong")

b = []
b.append(3)
print(b)
