import sys 
input = sys.stdin.readline
sys.setrecursionlimit(1000000)

n = int(input())
tree = [[] for _ in range(n+1)]
par = [0 for _ in range(n+1)]
for _ in range(n-1):
    a, b = map(int, input().split())
    tree[a].append(b)
    tree[b].append(a)

def dfs(num):
    for i in tree[num]:
        if par[i] == 0:
            par[i] = num 
            dfs(i)
    
dfs(1)

for i in range(2,n+1):
    print(par[i])