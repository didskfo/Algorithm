t = int(input())
for i in range(t):
    n = int(input())
    lst = []
    na = set()
    a = 1
    for j in range(n):
        lst.append(int(input()))
    while len(lst) != len(na):
        for k in range(len(lst)):
            na.add(lst[k]%a)
        a += 1
        if len(lst) == len(na):
            print(a-1)
            break
        else:
            na = set()