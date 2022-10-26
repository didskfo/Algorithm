A = []
B = []

n, m = map(int, input().split())
ans = [[0 for i in range(m)] for j in range(n)]

for i in range(n):
    lst = list(map(int, input().split()))
    A.append(lst)
for i in range(n):
    lst = list(map(int, input().split()))
    B.append(lst)

for i in range(n):
    for j in range(m):
        ans[i][j] = A[i][j] + B[i][j]
        print(ans[i][j], end=" ")
    print()