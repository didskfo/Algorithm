# import sys 
# input = sys.stdin.readline

# n = int(input())
# m = int(input())
# lst = []
# res = set()
# res_ = set()
# for i in range(m):
#     lst.append(list(map(int, input().split())))
# for i in range(m):
#     if lst[i][0] == 1:
#         res.add(lst[i][1])
#     elif lst[i][1] == 1:
#         res.add(lst[i][0])

# for i in range(m):
#     for j in res:
#         if lst[i][0] == j:
#             res_.add(lst[i][1])
#         elif lst[i][1] == j:
#             res_.add(lst[i][0])

# ans = (res | res_)
# if 1 in ans:
#     ans.remove(1)
# print(len(ans))

# # 실패

from collections import deque
import sys 
input = sys.stdin.readline 

n = int(input())
m = int(input())
visit = [0]*(n+1)
grh = [[] for _ in range(n+1)]
for _ in range(m):
    a, b = map(int, input().split())
    grh[a].append(b)
    grh[b].append(a)

cnt = 0
def dfs(a):
    visit[a] = 1
    global cnt
    for i in grh[a]:
        if visit[i] == 0:
            dfs(i)
            cnt += 1 
dfs(1)
print(cnt)