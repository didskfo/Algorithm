from math import factorial

n, m = map(int, input().split())
cnt = 0

num = int(factorial(n)/((factorial(n-m)*factorial(m))))
num = str(num)
lst = list(num)

while lst[-1] == "0":
    if lst[-1] == "0":
        cnt += 1 
        lst.pop(-1)
print(cnt)

# 시간초과