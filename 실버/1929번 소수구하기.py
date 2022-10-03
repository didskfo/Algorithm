import sys
import math 
input = sys.stdin.readline 

def solution(a):
    if a == 1:
        return False 
    sq = int(math.sqrt(a))
    for k in range(2, sq+1):
        if a%k == 0:
            return False 
    return True 

n, m = map(int, input().split())
for i in range(n, m+1):
    if solution(i):
        print(i)