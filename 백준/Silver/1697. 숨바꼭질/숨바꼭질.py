from collections import deque

n, k = map(int, input().split())
MAX = 100001
dist = [0]*MAX 

def bfs(cur):
    queue = deque()
    queue.append(cur)
    
    while queue:
        cur = queue.popleft()
        if k == cur:
            return dist[cur]
        for next in (cur-1, cur+1, cur*2):
            if 0<=next<MAX and not dist[next]:
                dist[next] = dist[cur]+1
                queue.append(next)
                
print(bfs(n))