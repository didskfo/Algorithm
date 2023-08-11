import sys 
input = sys.stdin.readline

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

while True:
    M, N = map(int, input().split())
    if M == 0 and N == 0:
        break
    edge = []
    parent = [i for i in range(M+1)]
    ans = 0
    
    for _ in range(N):
        x, y, z = map(int, input().split())
        edge.append((x, y, z))
        
    edge.sort(key=lambda x:x[2])
    
    for x, y, z in edge:
        if find(x) != find(y):
            union(x, y)
        else:
            ans += z
            
    print(ans)  