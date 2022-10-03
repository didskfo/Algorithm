import sys 
input = sys.stdin.readline 

lst_a = []
lst_b = []


n, m = map(int, input().split())
for i in range(n):
    lst_a.append(list(map(int, input().split())))

m, k = map(int, input().split())
for i in range(m):
    lst_b.append(list(map(int, input().split())))

lst_c = [[0 for _ in range(k)] for _ in range(n)]
for i in range(n):
    for j in range(k):
        for q in range(m):
            lst_c[i][j] += lst_a[i][q] * lst_b[q][j]

for i in lst_c:
    for j in i:
        print(j, end=" ")
    print()