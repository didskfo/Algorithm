import sys
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))
sum = [lst[0]]
for i in range(1,n):
    sum.append(sum[-1]+lst[i])

t = int(input())
for i in range(t):
    a, b = map(int, input().split())
    if a == 1:
        print(sum[b-1])
    else:
        print(sum[b-1]-sum[a-2])