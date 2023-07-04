import sys 
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))

lst.sort()

ans = lst[0]

for i in range(1, n):
    lst[i] = lst[i-1]+lst[i]
    ans += lst[i]
    
print(ans)