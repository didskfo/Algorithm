import sys 
input = sys.stdin.readline 

n = int(input())
lst = []
fib = 0
for i in range(n+1):
    if i == 0:
        fib = 0
    elif i == 1:
        fib = 1
    else:
        fib = lst[-1] + lst[-2]
    lst.append(fib)
print(lst[-1])