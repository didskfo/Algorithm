lst = list(map(int, input().split()))
res = [0 for x in range(6)]

for i in range(6):
    if i == 0 or i == 1:
        if lst[i] == 1:
            res[i] = 0
        else:
            res[i] = 1- lst[i]
    elif i == 5:
        if lst[i] == 8:
            res[i] = 0
        else:
            res[i] = 8 - lst[i]
    else:
        if lst[i] == 2:
            res[i] = 0
        else:
            res[i] = 2 - lst[i]
for i in res:
    print(i, end=" ")