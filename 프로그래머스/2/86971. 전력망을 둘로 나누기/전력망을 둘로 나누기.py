from collections import deque

def bfs(start, graph, link_check, visited):
    que = deque([start])
    visited[start] = True
    cnt = 1
    while que:
        s = que.popleft()
        for v in graph[s]:
            if visited[v] == False and link_check[start][v]:
                que.append(v)
                visited[v] = True
                cnt += 1
    return cnt

def solution(n, wires):
    answer = n
    link_check = [[True]*(n+1) for _ in range(n+1)]
    graph = [[] for _ in range(n+1)]
    
    for a, b in wires:
        graph[a].append(b)
        graph[b].append(a)
        
    for a, b in wires:
        visited = [False]*(n+1)
        link_check[a][b] = False
        cnt_a = bfs(a, graph, link_check, visited)
        cnt_b = bfs(b, graph, link_check, visited)
        link_check[a][b] = True
        
        answer = min(answer, abs(cnt_a-cnt_b))
        
    return answer