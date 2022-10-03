import sys
input = sys.stdin.readline

t = int(input())
for i in range(t):
    n, m = map(int, input().split())
    a = sorted(map(int, input().split()))
    b = sorted(map(int, input().split()))
    a_idx, b_idx = 0, 0 
    cnt = 0 
    while a_idx < n and b_idx < m:
        if a[a_idx] > b[b_idx]:
            cnt += 1 
            b_idx += 1 
            if b_idx == m:
                a_idx += 1 
                b_idx = 0
        else:
            a_idx += 1 
            b_idx = 0
    print(cnt)

# 시간초과