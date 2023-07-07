import sys 
input = sys.stdin.readline

n, m = map(int, input().split())
lan = []
for i in range(n):
    lan.append(int(input()))
    
start, end = 1, max(lan)

while start <= end:
    mid = (start+end)//2
    cnt = 0
    for i in lan:
        cnt += i//mid
        
    if cnt < m:
        end = mid-1
    else:
        start = mid+1

print(end)