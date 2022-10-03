from bisect import bisect_left
import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
name_lst = []
power_lst = []
for _ in range(n):
    name, power = input().split()
    name_lst.append(name)
    power_lst.append(int(power))

for _ in range(m):
    print(name_lst[bisect_left(power_lst, int(input()))])