from itertools import combinations
import sys 
input = sys.stdin.readline 

n, s = map(int, input().split())
lst = list(map(int, input().split()))
cnt = 0
for i in range(1, n+1):
    com = combinations(lst, i)
    for j in com:
        if sum(j) == s:
            cnt += 1 
print(cnt)