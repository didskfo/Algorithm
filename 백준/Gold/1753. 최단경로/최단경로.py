import sys 
input = sys.stdin.readline
import heapq
INF = int(1e9)

V, E = map(int, input().split())
K = int(input())
graph = [[] for _ in range(V+1)]
dist = [INF]*(V+1)
for _ in range(E):
    u, v, w = map(int, input().split())
    graph[u].append((v, w))
    
def Dijkstra(start):
    queue = []
    heapq.heappush(queue, (0, start))
    dist[start] = 0
    
    while queue:
        d, cur = heapq.heappop(queue)
        if dist[cur] < d:
            continue
        for i in graph[cur]:
            cost = d + i[1]
            if cost < dist[i[0]]:
                dist[i[0]] = cost 
                heapq.heappush(queue, (cost, i[0]))
                
Dijkstra(K)

for i in range(1, V+1):
    if dist[i] == INF:
        print("INF")
    else:
        print(dist[i])