import sys 
input = sys.stdin.readline 

n, m = map(int, input().split())
group = {}
for _ in range(n):
    g_name = input()
    people = int(input())
    for i in range(people):
        member = input()
        group[g_name] = group.get(g_name, []) + [member]

for _ in range(m):
    name = input()
    num = int(input())
    if num == 0:
        for i in sorted(group[name]):
            print(i, end="")
    else:
        for i in group:
            if name in group[i]:
                print(i, end="")