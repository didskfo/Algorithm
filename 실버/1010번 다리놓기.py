import math

t = int(input())
for i in range(t):
    a, b = map(int, input().split())
    if a == b:
        print(1)
    elif a == 1:
        print(b)
    else:
        print(math.factorial(b)//(math.factorial(a)*math.factorial(b-a)))