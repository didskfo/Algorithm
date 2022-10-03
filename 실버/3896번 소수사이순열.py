import sys
input = sys.stdin.readline 

def is_pn(n):
    for i in range(2, n):
        if i * i > n:
            break 
        if n % i == 0:
            return False 
    return True 

t = int(input())
for _ in range(t):
    n = int(input())
    if is_pn(n):
        print(0)
    else:
        lst = []
        while not is_pn(n):
            lst.append(n)
            n += 1 
        print(len(lst))