def convert(n):
    num = ""
    while n:
        num += str(n%3)
        n //= 3
    return num

def solution(n):
    answer = 0
    a = convert(n)
    answer = int(a, 3)
    return answer