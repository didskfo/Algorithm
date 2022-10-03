a, b = map(int, input().split())
cnt = 1

while b != a:
    cnt += 1 
    cb = b
    if b % 10 == 1:
        b = b // 10
    elif b % 2 == 0:
        b = b // 2 

    if cb == b:
        print(-1)
        break
        
else:
    print(cnt)