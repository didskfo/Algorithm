from itertools import combinations
import sys 
input = sys.stdin.readline 

while 1:
    n = list(map(int, input().split()))
    if n[0] == 0:
        break 
    del n[0]
    res = list(combinations(n, 6))
    for i in res:
        for j in i:
            print(j, end=" ")
        print()
    print()