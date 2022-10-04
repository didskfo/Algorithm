def gcd(a, b):
    while b != 0:
        n = a%b
        a = b
        b = n
    return a

ring = int(input())
lst = list(map(int, input().rstrip().split()))
for _ in range(ring):
    lst[_] = lst[_]*2

for i in range(1, ring):
    gng = gcd(lst[0], lst[i])
    print('{}/{}'.format(lst[0]//gng, lst[i]//gng))