def solution(lottos, win_nums):
    low = 0
    high = 0
    for i in lottos:
        if i in win_nums:
            low += 1
            high += 1
        elif i == 0:
            high += 1
    low = 7-low if 7-low < 6 else 6
    high = 7-high if 7-high < 6 else 6
    answer = [high, low]
    return answer