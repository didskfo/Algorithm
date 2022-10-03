import sys 
input = sys.stdin.readline 

t = int(input())
for _ in range(t):
    zero = [1, 0]
    one = [0, 1]
    n = int(input())
    for i in range(n):
        zero.append(zero[-1]+zero[-2])
        one.append(one[-1]+one[-2])
    print(zero[n], one[n])