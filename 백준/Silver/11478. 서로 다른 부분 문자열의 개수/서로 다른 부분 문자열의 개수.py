a = input()
ans = set()

for i in range(len(a)):
    for j in range(i, len(a)):
        tmp = a[i:j+1]
        ans.add(tmp)

print(len(ans))