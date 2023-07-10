import sys 
input = sys.stdin.readline

n, c = map(int, input().split())
arr = []
for i in range(n):
    arr.append(int(input()))
arr.sort()
start, end = 1, arr[-1]-arr[0]
answer = 0

while start <= end:
    mid = (start+end)//2
    curr = arr[0]
    cnt = 1
    
    for i in range(1, len(arr)):
        if arr[i] >= curr+mid:
            cnt+=1
            curr = arr[i]
            
    if cnt >= c:
        start = mid+1
        answer = start-1
    else:
        end = mid-1
        
print(answer)