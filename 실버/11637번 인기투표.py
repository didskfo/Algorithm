import sys 
input = sys.stdin.readline 

t = int(input())
for _ in range(t):
    n = int(input())
    lst = []
    for i in range(n):
        lst.append(int(input()))
    mid = sum(lst) / 2
    ans = [x for x in lst if x == max(lst)]
    if len(ans) > 1:
        print("no winner")
    else:
        max_idx = int(lst.index(max(lst))) + 1
        if max(lst) > mid:
            print("majority winner", max_idx)
        else:
            print("minority winner", max_idx)