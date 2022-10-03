n = int(input())
m = int(input())
res = []

for i in range(n,m+1):
    er = 0
    if i > 1:
        for j in range(2,i):
            if i % j == 0:
                er += 1
                break
        if er == 0:
            res.append(i)
if len(res) > 0:            
    print(sum(res))
    print(min(res))
else:
    print(-1)