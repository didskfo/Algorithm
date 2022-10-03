a = list(input())
for i in range(97, 123):
    if chr(i) in a:
        print(a.index(chr(i)), end=" ")
    else:
        print(-1, end=" ")