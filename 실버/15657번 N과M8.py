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
        if not s:
            s.append(i)
            dfs()
            s.pop()
        elif i >= s[-1]:
            s.append(i)
            dfs()
            s.pop()

dfs()