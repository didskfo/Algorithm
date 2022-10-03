# 인덱스 에러

# import sys 
# input = sys.stdin.readline

# a, b, n = map(int, input().split())
# res = str(a/b - a//b)[2:] 
# print(res[n-1])

import sys 
input = sys.stdin.readline 

a, b, n = map(int, input().split())
res = str(a/b - a//b)[2:]
ans = res[n-1]
print(ans)