n, k = map(int, input().split())
lst = [True]*(n+1)
cnt = 0
for i in range(2, n+1):
    if lst[i] == True:
        for j in range(i, n+1, i):
            if lst[j] == True:
                lst[j] = False 
                cnt += 1 
            if cnt == k:
                print(j)
                break