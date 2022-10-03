import sys 
input = sys.stdin.readline 

t = int(input())
for i in range(t):
    p, q = map(int, input().split())
    lst = []
    fib = 0
    for i in range(p+1):
        if i == 0:
            fib = 0
        elif i == 1:
            fib = 1
        else:
            fib = lst[-1] + lst[-2]
        lst.append(fib)
    print(f"Case #{i+1}: {lst[-1]%q}")

# 시간초과