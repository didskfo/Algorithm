from itertools import combinations 
import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
card = list(map(int, input().split()))
com = list(combinations(card, 3))
sum = []
for i in range(len(com)):
    a = 0
    for j in range(3):
        a += int(com[i][j])
    sum.append(a)

res = -1
for i in range(len(sum)):
    if sum[i] > res and sum[i] <= m:
        res = sum[i]

print(res)