import sys 
input = sys.stdin.readline 

n = int(input())
lst = list(map(int, input().split()))
stu = [i+1 for i in range(n)]
for i in range(n):
    stu.insert(i-lst[i], stu.pop(i))
for i in range(n):
    print(stu[i], end=" ")