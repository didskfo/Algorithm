a, b = map(int, input().split())
lst = []
fib = 0
res = 0
for i in range(b+1):
        if i == 0:
            fib = 0 
        elif i == 1:
            fib = 1
        else:
            fib = lst[-1] + lst[-2]
        lst.append(fib%1000000000)
if a == b:
    print(lst[-1])
else:
    for i in range(a, b+1):
        res += lst[i]
    print(res)

# 메모리 초과