from itertools import permutations
import sys 
input = sys.stdin.readline

n, m = map(int, input().split())
lst = list(map(int, input().split()))
ans = sorted(list(permutations(lst, m)))

for i in ans:
    for j in i:
        print(j, end=" ")
    print()