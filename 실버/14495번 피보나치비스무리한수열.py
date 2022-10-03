n = int(input())
lst = []

for i in range(1,n+1):
    if i == 1 or i == 2 or i == 3:
        fib = 1
    else:
        fib = lst[-1] + lst[-3]
    lst.append(fib)
print(lst[-1])