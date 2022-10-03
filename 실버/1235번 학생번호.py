t = int(input())
stu = []
ans = set()
a = 1
for i in range(t):
    stu.append(input())
for i in range(t):
    stu[i] = stu[i][::-1]
for i in range(t):
    ans.add(stu[i][0])
if len(ans) == t:
    print(1)
else:
    ans = set()
    while len(ans) != t:
        for i in range(t):
            ans.add(stu[i][0:a])
        if len(ans) == t:
            print(a)
            break
        else:
            a += 1
            ans = set()