def solution(price, money, count):
    answer = 0
    res = 0
    for i in range(count):
        res += price*(i+1)
    if res > money:
        return res - money
    return answer