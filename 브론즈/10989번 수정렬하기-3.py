import sys 
input = sys.stdin.readline 

n = int(input())
lst = [0]*10000

for i in range(n):
    a = int(input())
    lst[a-1] += 1 

for i in range(10000):
    if lst[i] != 0:
        for j in range(lst[i]):
            print(i+1)