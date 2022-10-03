import sys 
input = sys.stdin.readline 

n = int(input())
m = int(input())
IF = sys.maxsize
graph = [[] for _ in range(n+1)]
dp = [IF for _ in range(n+1)]
for _ in range(m):
    a, b, m = map(int, input().split())
    graph[a].append([b,m])
start, end = map(int, input().split())

def find(start):
    dp[start] = 0
    