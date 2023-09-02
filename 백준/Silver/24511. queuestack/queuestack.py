import sys 
input = sys.stdin.readline
from collections import deque

n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
m = int(input())
C = list(map(int, input().split()))

queue = deque()

for i in range(n):
    if A[i] == 0:
        queue.append(B[i])
        
for i in range(m):
    queue.appendleft(C[i])
    print(queue.pop(), end=" ")