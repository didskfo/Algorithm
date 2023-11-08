def solution(x):
    a = str(x)
    num = 0
    for i in range(len(a)):
        num += int(a[i])
    if x % num == 0:
        return True
    return False