import sys 
input = sys.stdin.readline

V, E = map(int, input().split())
parent = [i for i in range(V+1)]
graph = []

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
for _ in range(E):
    a, b, c = map(int, input().split())
    graph.append((a, b, c))
graph.sort(key=lambda x:x[2])

ans = 0

for a, b, c in graph:
    if not same(a, b):
        union(a, b)
        ans += c 

print(ans)