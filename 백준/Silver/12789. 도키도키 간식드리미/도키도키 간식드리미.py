import sys 
input = sys.stdin.readline
from collections import deque

n = int(input())
queue = deque(map(int, input().split()))
stack = deque()
num = 1

while queue:
    if queue and queue[0] == num:
        queue.popleft()
        num += 1
    else:
        stack.append(queue.popleft())
    
    while stack and stack[-1] == num:
        stack.pop()
        num += 1 

print("Nice" if not stack else "Sad")