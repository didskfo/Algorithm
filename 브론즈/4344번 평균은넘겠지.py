t = int(input())
for i in range(t):
    lst = list(map(int, input().split()))
    a = lst.pop(0)
    avg = sum(lst)/len(lst)
    cnt = 0
    for j in range(len(lst)):
        if lst[j] > avg:
            cnt += 1
    res = cnt/len(lst)*100
    print("%0.3f%%" %res)