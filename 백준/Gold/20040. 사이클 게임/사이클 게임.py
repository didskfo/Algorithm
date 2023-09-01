import sys 
input = sys.stdin.readline

def find(a):
    if parent[a] == a:
        return a
    parent[a] = find(parent[a])
    return parent[a]

def union(a, b):
    a = find(a)
    b = find(b)
    
    if a < b:
        parent[b] = a
    else:
        parent[a] = b 

n, m = map(int, input().split())
parent = [i for i in range(n+1)]
rank = []

for i in range(m):
    a, b = map(int, input().split())
    if find(a) == find(b):
        print(i+1)
        exit(0)
    union(a, b)
else:
    print(0)