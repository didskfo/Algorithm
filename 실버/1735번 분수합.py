import sys
input = sys.stdin.readline

def cys(a, b):
    while a%b != 0:
        mod = a%b 
        a = b
        b = mod 
    return b 
a, b = map(int, input().split())
c, d = map(int, input().split())
yak = cys(b,d)
moe = b*(d//yak)
ja = a*(d//yak) + c*(b//yak) 
yak_2 = cys(moe, ja)
print(ja//yak_2, moe//yak_2)