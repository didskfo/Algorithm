from itertools import combinations
import sys
input = sys.stdin.readline 

n, m = map(int, input().split())
lst = sorted(list(map(int, input().split())))

res = list(combinations(lst, m))
for i in res:
    for j in i:
        print(j, end=" ")
    print()