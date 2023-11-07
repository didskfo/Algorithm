def solution(n):
    n = str(n)
    lst = list(n)
    lst.sort(reverse=True)
    answer = int("".join(lst))
    return answer