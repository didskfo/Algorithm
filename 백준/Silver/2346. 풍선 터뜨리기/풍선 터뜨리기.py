import sys 
input = sys.stdin.readline
from collections import deque

n = int(input())
lst = deque(enumerate(map(int, input().split())))
ans = []

while lst:
    idx, num = lst.popleft()
    ans.append(idx+1)
    if num > 0:
        lst.rotate(-(num-1))
    else:
        lst.rotate(-num)

print(*ans)