import sys 
input = sys.stdin.readline 
n = int(input())
res = 1
for i in range(1,n+1):
    res *= i
while 1:
    if str(res)[-1] == "0":
        res = res//10
    else:
        break

print(str(res)[-5:])