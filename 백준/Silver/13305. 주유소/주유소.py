import sys 
input = sys.stdin.readline

n = int(input())
dis = list(map(int, input().split()))
cost = list(map(int, input().split()))
total = dis[0]*cost[0]
low = cost[0]
pres = 1

while pres != n-1:
    if low >= cost[pres]:
        low = cost[pres]
        total += low * dis[pres]
    else:
        total += low * dis[pres]
    pres += 1

print(total)