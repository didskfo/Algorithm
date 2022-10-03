n = input()
if len(n) == 1:
    n = "0" + n 
a = n 
cnt = 0
while 1:
    if len(a) == 1:
        a = "0" + a 
    res = str(int(a[0]) + int(a[1]))
    a = a[-1] + res[-1]
    cnt += 1 
    if a == n:
        break 
print(cnt)