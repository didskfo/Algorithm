import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
lst = sorted(list(map(int, input().split())))

s = []

def dfs():
    if len(s) == m:
        print(" ".join(map(str, s)))
        return
    for i in lst:
        s.append(i)
        dfs()
        s.pop()
    
dfs()