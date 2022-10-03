lst = list(range(1,101))
for i in range(1,101):
    res = i 
    a = str(i)
    for j in range(len(str(i))):
        res += int(a[j])
        print(res)
        if res in lst:
            lst.remove(res)
for i in range(len(lst)):
    print(lst[i])