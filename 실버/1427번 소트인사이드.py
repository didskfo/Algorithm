a = list(input())
a = list(map(int, a))
a.sort()
a.reverse()
for i in range(len(a)):
    print(a[i], end="")