import sys

a, b, d = map(int, sys.stdin.readline().split())
lst = []
cnt = 0
for i in range(a, b+1):
    er = 0
    if i > 1:
        for j in range(2,int(i**0.5)+1):
            if i % j == 0:
                er += 1
        if er == 0:
            lst.append(i) 
for i in lst:
    i = str(i)
    for j in range(len(i)):
        if int(i[j]) == d:
            cnt += 1 
print(cnt)

# 시간초과