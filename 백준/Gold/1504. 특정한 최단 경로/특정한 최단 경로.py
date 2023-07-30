import sys 
input = sys.stdin.readline
import heapq
INF = int(1e9)

N, E = map(int, input().split())
graph = [[] for _ in range(N+1)]
for _ in range(E):
    a, b, c = map(int, input().split())
    graph[a].append((b, c))
    graph[b].append((a, c))
v1, v2 = map(int, input().split())

def Dijkstra(start, end):
    dist = [INF]*(N+1)
    dist[start] = 0
    queue = []
    heapq.heappush(queue, (0, start))
    
    while queue:
        d, cur = heapq.heappop(queue)
        if dist[cur] < d:
            continue
        for i in graph[cur]:
            cost = d + i[1]
            if cost < dist[i[0]]:
                dist[i[0]] = cost 
                heapq.heappush(queue, (cost, i[0]))
    return dist[end]
                
path1 = Dijkstra(1, v1) + Dijkstra(v1, v2) + Dijkstra(v2, N)
path2 = Dijkstra(1, v2) + Dijkstra(v2, v1) + Dijkstra(v1, N)

if path1 >= INF and path2 >= INF:
    print(-1)
else:
    print(min(path1, path2))