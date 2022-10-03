import sys

n = int(input())
lst = list(map(int, sys.stdin.readline().split()))
cnt = 0
for i in lst:
    er = 0
    if i > 1:
        for j in range(2,i):
            if i % j == 0:
                er += 1
        if er == 0:
            cnt += 1
print(cnt)