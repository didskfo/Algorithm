# a = int(input())
# cnt = 0 
# cnt = cnt + a//5 
# cnt = cnt + a%5//3
# if a//5 + a%5//3 == a:
#     print(cnt)
# else:
#     print(-1)

# a = int(input())
# cnt = 0 
# if a%5 == 0:
#     cnt = a//5 
#     print(cnt)
# elif a%3 == 0:
#     cnt = a//3
#     print(cnt)
# elif a//5 + a%5//3 == a:
#     cnt = cnt + a//5 
#     cnt = cnt + a%5//3 
#     print(cnt)
# else:
#     print(-1)

a = int(input())
if a%5 == 0:
    print(a//5)
else:
    cnt = 0 
    while a>0:
        a -= 3
        cnt += 1 
        if a%5 == 0:
            cnt += a//5 
            print(cnt)
            break 
        elif a == 1 or a == 2:
            print(-1)
            break 
        elif a == 0:
            print(cnt)
            break 