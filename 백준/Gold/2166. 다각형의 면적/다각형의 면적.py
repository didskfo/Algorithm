import sys 
input = sys.stdin.readline

N = int(input())
x = []
y = []
for _ in range(N):
    a, b = map(int, input().split())
    x.append(a)
    y.append(b)
x.append(x[0])
y.append(y[0])

xp = 0
yp = 0

for i in range(N):
    xp += x[i]*y[i+1]
    yp += x[i+1]*y[i]

ans = abs((xp-yp)/2)
print("%.1f" %ans)