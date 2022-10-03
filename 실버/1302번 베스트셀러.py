t = int(input())
lst = []
for i in range(t):
    lst.append(input())

ans = {x : lst.count(x) for x in set(lst)}
best_ = []
for i in ans:
    if ans[i] == max(ans.values()):
        best_.append(i)
print(best_)
print(sorted(best_)[0])