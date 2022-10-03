while True:
    lst = list(map(int, input().split()))
    lst.sort()
    if sum(lst) == 0:
        break
    if lst[-1]**2 == lst[-2]**2 + lst[-3]**2:
        print("right")
    else:
        print("wrong")