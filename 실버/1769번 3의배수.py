num = input()
res = 0
cnt = 0

if len(num) == 1:
    print(cnt)
    if int(num) % 3 == 0:
        print("YES")
    else:
        print("NO")
else:
    while len(num) > 1:
        for i in num:
            res += int(i)
        cnt += 1 
        num = str(res)
        res = 0
    print(cnt)
    if int(num) % 3 == 0:
        print("YES")
    else:
        print("NO")