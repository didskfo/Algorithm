import sys
input = sys.stdin.readline

def union(x, y):
    x = find(x)
    y = find(y)
    if x > y:
        parent[x] = y
    else:
        parent[y] = x
        
def find(x):
    if x != parent[x]:
        parent[x] = find(parent[x])
    return parent[x]

N = int(input())
M = int(input())
parent = [i for i in range(N)]
for i in range(N):
    arr = list(map(int, input().split()))
    for j in range(N):
        if arr[j] == 1:
            union(i, j)
path = list(map(int, input().split()))
parent = parent
start = parent[path[0]-1]
for i in range(1, M):
    if parent[path[i]-1] != start:
        print("NO")
        break
else:
    print("YES")