import sys
input = sys.stdin.readline
import math 

N, M = map(int, input().split())
parent = [i for i in range(N+1)]
stars = []
edges = []

def find(x):
    if parent[x] == x:
        return x
    parent[x] = find(parent[x])
    return parent[x]

def union(x, y):
    x = find(x)
    y = find(y)
    
    if x < y:
        parent[y] = x
    else:
        parent[x] = y
        
def same(x, y):
    return find(x) == find(y)

for _ in range(N):
    x, y = map(int, input().split())
    stars.append((x, y))
    
for _ in range(M):
    x, y = map(int, input().split())
    union(x-1, y-1)
    
for i in range(N - 1):
    for j in range(i + 1, N):
        edges.append((math.sqrt((stars[i][0] - stars[j][0])**2 + (stars[i][1] - stars[j][1])**2), i, j))
    
edges.sort()

ans = 0

for a, b, c in edges:
    if not same(b, c):
        union(b, c)
        ans += a
        
print("%.2f" %ans)