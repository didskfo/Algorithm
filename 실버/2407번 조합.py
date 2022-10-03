from math import factorial

n, m = map(int, input().split())

num = factorial(n)//((factorial(n-m)*factorial(m)))
print(num)