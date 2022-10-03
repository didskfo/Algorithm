import sys 
input = sys.stdin.readline 

n = int(input())
idx = list(map(int, input().split()))
k = int(input())
cnt = 0

def dfs(num, idx):
    idx[num] = -2
    for i in range(len(idx)):
        if num == idx[i]:
            dfs(i, idx)

dfs(k, idx)

for i in range(len(idx)):
    if idx[i] != -2 and i not in idx:
        cnt += 1 

print(cnt)