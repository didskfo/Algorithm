import sys 
input = sys.stdin.readline 

n = int(input())
lst = list(map(int, input().split()))
dp_up = [1 for _ in range(n)]
dp_down = [1 for _ in range(n)]
for i in range(1, n):
    if lst[i] >= lst[i-1]:
        dp_up[i] = max(dp_up[i], dp_up[i-1]+1)
    if lst[i] <= lst[i-1]:
        dp_down[i] = max(dp_down[i], dp_down[i-1]+1)
print(max(max(dp_up), max(dp_down)))