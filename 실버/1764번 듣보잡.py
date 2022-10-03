import sys
input = sys.stdin.readline 

n, m = map(int, input().split())
lis = set()
saw = set()
for i in range(n):
    lis.add(input().rstrip())
for i in range(m):
    saw.add(input().rstrip())
ans = sorted(list(lis & saw))
print(len(ans)) 
for i in ans:
    print(i)