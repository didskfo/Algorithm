import sys 
input = sys.stdin.readline 

string = input()
n = int(input())
for _ in range(n):
    lst = list(map(str, input().split()))
    al = lst[0]
    l = int(lst[1])
    r = int(lst[2])
    cnt = 0
    for i in range(l, r+1):
        if al == string[i]:
            cnt += 1
    print(cnt)