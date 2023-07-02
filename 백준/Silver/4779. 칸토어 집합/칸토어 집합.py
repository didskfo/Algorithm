import sys
input = sys.stdin.readline

def cut(s, a):
    if a == 1:
        return 
    for i in range(s+a//3, s+(a//3)*2):
        arr[i] = ' '
    cut(s, a//3)
    cut(s+a//3*2, a//3)

while True:
    try:
        n = int(input())
        arr = ['-']*(3**n)
        cut(0, 3**n)
        print(''.join(arr))
    except:
        break