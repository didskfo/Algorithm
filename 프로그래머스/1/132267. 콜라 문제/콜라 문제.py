def solution(a, b, n):
    answer = 0
    while n >= 2:
        if n < a:
            break
        cnt = n//a
        n -= a*cnt
        n += b*cnt
        answer += b*cnt
    return answer