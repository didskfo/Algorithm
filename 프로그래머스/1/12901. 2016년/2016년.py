def solution(a, b):
    answer = ''
    month = [31,29,31,30,31,30,31,31,30,31,30,31]
    day = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
    cnt = 0
    for i in range(a-1):
        cnt += month[i]
    cnt += b
    answer = day[(cnt+4)%7]
    return answer