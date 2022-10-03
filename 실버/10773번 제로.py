import sys 
input = sys.stdin.readline 

lst = []
for _ in range(int(input())):
    a = int(input())
    if a != 0:
        lst.append(a)
    else:
        lst.pop()
print(sum(lst))