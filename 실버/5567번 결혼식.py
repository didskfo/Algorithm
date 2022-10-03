# import sys
# input = sys.stdin.readline

# n = int(input())
# m = int(input())
# grh = [[] for i in range(n+1)]
# for _ in range(m):
#     a, b = map(int, input().split())
#     grh[a].append(b)
#     grh[b].append(a)

# visit = [False for i in range(n+1)]
# people = 0

# def dfs(start):
#     global people
#     visit[start] = True 
#     for i in grh[start]:
#         if visit[i] == False:
#             dfs(i)
#             people += 1 

# dfs(1)
# print(people)