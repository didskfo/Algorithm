# import sys 
# input = sys.stdin.readline 

# n = int(input())
# lst = list(range(1,n+1))
# print(lst)
# for i in range(n):
#     lst.append(i+1)
# while len(lst) != 1:
#     del lst[0]
#     a = lst[0]
#     lst.append(a)
#     del lst[0]
# print(lst[0])

from collections import deque
import sys 
input = sys.stdin.readline 

n = int(input())
que = deque([i for i in range(1,n+1)])
while len(que) != 1:
    que.popleft()
    que.append(que.popleft())
print(que[0])