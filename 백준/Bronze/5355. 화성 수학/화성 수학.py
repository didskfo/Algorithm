n = int(input())
for _ in range(n):
    lst = list(map(str, input().split()))
    res = float(lst[0])

    lst = lst[1:]
    for i in lst:
        if i == "@":
            res = res * 3
        elif i == "%":
            res = res + 5 
        elif i == "#":
            res = res - 7 

    print("{:.2f}".format(res))