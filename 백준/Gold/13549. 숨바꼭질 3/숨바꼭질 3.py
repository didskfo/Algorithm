from collections import deque

n, k = map(int, input().split())
MAX = 100001
dist = [-1]*MAX

queue = deque()
queue.append(n)
dist[n] = 0

while queue:
    curr = queue.popleft()
    if curr == k:
        print(dist[k])
        break 
    for newCurr in (curr*2, curr-1, curr+1):
        if 0 <= newCurr < MAX and dist[newCurr] == -1:
            if newCurr == curr*2:
                dist[newCurr] = dist[curr]
                queue.appendleft(newCurr)
            else:
                dist[newCurr] = dist[curr]+1
                queue.append(newCurr)