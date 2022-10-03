a = int(input())
ans = int(a**0.5)
if ans**2 < a:
    print(ans+1)
else:
    print(ans)