from collections import deque

n = int(input())
num = 1
error = 0
que = deque()
ans = []

for _ in range(n):
    a = int(input())
    while num <= a:
        que.append(num)
        ans.append("+")
        num += 1 
    if que[-1] == a:
        que.pop()
        ans.append("-")
    else:
        print("NO")
        error += 1
        break
    
if error == 0:
    for i in ans:
        print(i)