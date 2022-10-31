a = input().upper()

dic = {}

for i in a:
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1 

ans = [x for x in dic.keys() if dic[x] == max(dic.values())]
if len(ans) > 1:
    print("?")
else:
    print(ans[0])