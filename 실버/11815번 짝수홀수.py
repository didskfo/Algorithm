import sys 
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))
for num in lst:
    if int(num**0.5) ** 2 == num:
        print(1, end=" ")
    else:
        print(0, end=" ")
