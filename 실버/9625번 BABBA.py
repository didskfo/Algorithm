# from collections import deque 
# import sys 
# input = sys.stdin.readline 

# n = int(input())
# que = deque(['A'])
# a = 0 
# b = 0
# for _ in range(n):
#     l = len(que)
#     for i in range(l):
#         s = que.popleft()
#         if s == 'A':
#             que.append('B')
#         else:
#             que.append('B')
#             que.append('A')
# for _ in range(len(que)):
#     l = que.pop()
#     if l == 'A':
#         a += 1 
#     else:
#         b += 1
# print(a, b)

import sys 
input = sys.stdin.readline 

A = [1, 0]
B = [0, 1]
n = int(input())
for i in range(n):
    A.append(A[-1]+A[-2])
    B.append(B[-1]+B[-2])
print(A[n], B[n])